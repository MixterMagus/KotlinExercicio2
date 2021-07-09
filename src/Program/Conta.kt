package Program

import java.math.BigDecimal

class Conta{
    private var agencia=Int
    private var numberAcc=Int
    private var balance= BigDecimal(2)

    fun deposito(valor:BigDecimal){
        this.balance+=valor
    }

    fun saque(valor:BigDecimal){
        this.balance-=valor
    }
}
