class rectangulo(var base:Double, var altura:Double){
    init {
        require(altura > 0) { "altura deve ser mayor a 0 " }
        require(base > 0) { "base deve ser mayor a 0 " }
    }


    fun area():Double{
        return base * altura
    }


    fun perimetro():Double{
        return 2 * (base + altura)
    }


    override fun toString() = "Rectangulo($base, $altura)"
}

fun main() {


    val rectangulo1 = rectangulo(5.0, 4.0)
    println("El area del rectangulo1 es = ${rectangulo1.area()}")
    println("El perimetro del rectangul1 es = ${rectangulo1.perimetro()}")
    val rectangulo2 = rectangulo(10.0, 1.0)
    println("El area del rectangulo2 es = ${rectangulo2.area()}")
    println("El perimetro del rectangulo2 es = ${rectangulo2.perimetro()}")
    val rectangulo3 = rectangulo(1.0, 1.0)
    println("El area del rectangulo3 es = ${rectangulo3.area()}")
    println("El perimetro del rectangulo3 es = ${rectangulo3.perimetro()}")
}
