package Program

enum class ClientType(val description: String, var changeable: String) {
    PF("Pessoa Física","default"),
    PJ("Pessoa Jurídica","default")

    /* companion object{
        printDescription()

    } */

}