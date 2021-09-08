import kotlin.system.exitProcess

val egg :String = """
    |,___,     ,___,
    |[O.o]     [O.o]
    |/)__)     /)__)
    |-"--"------"--"----
""".trimMargin("|")
val helpMessage :String = """
    *>] new - Crea un nuovo progetto
    *>] see - Vedi i progetti creati
    *>] see <name> - Vedi il progetto <name>
    *>] add <name> - Aggiungi movimenti al progetto <name>
    *>] eval <name> - Restituisce i risultati del progetto <name>
    *>] clear - Pulisce lo schermo
    *>] quit - Chiudi
""".trimMargin("*")


fun main()  {

    println("""
        *>[ ================================================= ]<
        *   | Benvenuto in AllaRomana! Cosa vuoi fare oggi? |
        *>[ ================================================= ]<
        *>] new - Crea un nuovo progetto
        *>] see - Vedi i progetti creati
        *>] see <name> - Vedi il progetto <name>
        *>] add <name> - Aggiungi movimenti al progetto <name>
        *>] eval <name> - Restituisce i risultati del progetto <name>
        *>] clear - Pulisce lo schermo
        *>] quit - Chiudi
    """.trimMargin("*"))

    while (true) {

        println("\n>] Scrivi 'help' per la lista dei comandi!")
        var ans :String? = readLine()

        when {
            ans == "help" -> println(helpMessage)
            ans == "egg" -> println(egg)
            ans == "new" -> projectCreator()
            ans == "quit" -> exitProcess(1)
        }

    }

}