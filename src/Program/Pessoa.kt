package Program

class Pessoa{
    private var name="Salomão"
    private var cpf=12596204681

    constructor()

    inner class endereco{
    private var street="Rua Santo Onofre"
    private var number=109
    fun getStreet():String{return street}
    fun getNumber():Int{return number}
    }

    fun getInformation() = "Nome: $name Cpf: $cpf"
    fun getFullInformation() = "Nome: ${name.toUpperCase()} Cpf: $cpf Endereço: ${endereco().getStreet().toUpperCase()} ${endereco().getNumber()}"
    fun setName(name:String){this.name = name}
    fun setCPF(cpf:Long){this.cpf=cpf}
}