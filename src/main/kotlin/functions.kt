import java.io.File

fun projectCreator() {
    val home :String = System.getProperty("user.home")
    println(">! Come chiamiamo questo nuovo progetto?")
    val name :String? = readLine()
    println(">! Inserisci i nomi dei partecipanti (separali con la virgola): ")
    val partecipants :List<String>? = readLine()?.split(",")
    println(partecipants)

    with(File(home+"/"+name+".rmn")) {
        this.createNewFile()
        this.writeText("Transazione,")
        partecipants?.forEach {
            when {
                partecipants.indexOf(it) != partecipants.size -> this.writeText(it+"(Pagato|Speso),")
                else -> this.writeText(it+"(Pagato|Speso)\n")
            }
            this.writeText("\n")
        }
        println(">] Progetto creato!")

    }

}