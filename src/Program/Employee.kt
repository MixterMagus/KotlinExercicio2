package Program

import java.math.BigDecimal

abstract class Employee(name: String, cpf: String,val salario: Double) : Pessoa(name,cpf){
    abstract fun calculoAuxilio(): Double
    override fun toString():String="""
        Name: $name
        CPF: $cpf
        Salário: $salario
        Auxilio: ${calculoAuxilio()}
        """.trimIndent()
}