package Program

class Manager(name: String, cpf: String, salario: Double) : Employee(name, cpf, salario) {
    override fun calculoAuxilio(): Double =salario*0.3
}