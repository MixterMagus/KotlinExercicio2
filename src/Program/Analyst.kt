package Program

import java.math.BigDecimal

class Analyst(name: String, cpf: String, salario: Double) : Employee(name, cpf, salario) {
    override fun calculoAuxilio(): Double =salario*0.1
}