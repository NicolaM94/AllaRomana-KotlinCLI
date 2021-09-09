import java.io.File
import java.io.FileNotFoundException

fun projectCreator() {
    val home :String = System.getProperty("user.home")
    println(">! Come chiamiamo questo nuovo progetto?")
    val name :String? = readLine()
    println(">! Inserisci i nomi dei partecipanti (separali con la virgola): ")
    val partecipants :List<String>? = readLine()?.split(",")
    println(partecipants)

    with(File(home+"/"+name+".rmn")) {
        this.createNewFile()
        this.appendText("Transazione,")
        partecipants?.forEach {
            when {
                (partecipants.indexOf(it)!=partecipants.size) -> this.appendText(it + "(Pagato|Speso),")
                else -> this.appendText(it + "(Pagato|Speso)\n")
            }
        }
        this.appendText("\n")
        println(">] Progetto creato!")

    }

}

fun projectFinder() {
    println(">] Ecco i progetti che ho trovato: ")
    File(System.getProperty("user.home")).walk().forEach {
        if (it.name.endsWith(".rmn")) println(it.name)
    }

}

fun projectLookUp (projectName:String) {

    try {
        with(File(System.getProperty("user.hom")+"/"+projectName+".rmn")) {
            println(this.readLines())
        }
    } catch (exception:FileNotFoundException) {
        println(">] Non ci sono progetti con quel nome!")}

}