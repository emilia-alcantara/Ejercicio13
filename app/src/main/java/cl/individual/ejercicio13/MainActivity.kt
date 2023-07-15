package cl.individual.ejercicio13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
    var resultado = suma(5.5, 6.4F)
    println(resultado)

    var resultRound = redondear(7.6)
    println(resultRound)

    var moneda = mostrarResultado(8.57)
    println(moneda)
}

fun suma (param1: Double, param2:Float) : Double = param1 + param2

fun redondear (param1: Double) = ceil(param1)

fun mostrarResultado(numero: Double) : String {

    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("EUR"))
    return format.format(numero)

}


