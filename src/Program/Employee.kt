package Program

import java.math.BigDecimal

abstract class Employee (
    name: String,
    cpf: String,
    val salario: BigDecimal
) : Pessoa(name,cpf){
    abstract fun calculoAuxilio()
}