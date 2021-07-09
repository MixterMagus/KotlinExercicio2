package Program

import java.math.BigDecimal

class Employee (
    override val name: String,
    override val cpf: String,
    val salario: BigDecimal
) : Pessoa(name,cpf){

}