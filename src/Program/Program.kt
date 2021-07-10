package Program

fun main(){
    println("Hello word")
    var joao = Analyst("Jãum","45645465", 2000.00)
    println(joao.salario+joao.calculoAuxilio())
    println(printReport(joao))
    println("---------------------------------------------")
    var maria = Manager("Maria","12345677",3500.00)
    println(maria.salario+maria.calculoAuxilio())
    println(maria.toString())
}

fun printReport(funcionario:Employee)=funcionario.toString()