fun main() {
    while (true) {
        println("\n===== MENÚ PRINCIPAL =====")
        println("1. Calcular superficie de un cuadrado")
        println("2. Calcular total de una compra")
        println("3. Calcular índice de masa corporal (IMC)")
        println("4. Validar entrada con clave")
        println("5. Calcular sueldo con horas extras")
        println("6. Salir")
        print("Seleccione una opción: ")

        val opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> calcularSuperficieCuadrado()
            2 -> calcularTotalCompra()
            3 -> calcularIMC()
            4 -> validarClave()
            5 -> calcularSueldo()
            6 -> {
                println("Saliendo del programa...")
                break
            }
            else -> println("Opción no válida. Intente de nuevo.")
        }
    }
}

fun calcularSuperficieCuadrado() {
    println("\nIngrese el valor del lado del cuadrado:")
    val lado = readLine()?.toDoubleOrNull() ?: 0.0
    val superficie = lado * lado
    println("La superficie del cuadrado es: $superficie")
}

fun calcularTotalCompra() {
    println("\nIngrese el precio del artículo:")
    val precio = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese la cantidad de artículos adquiridos:")
    val cantidad = readLine()?.toIntOrNull() ?: 0

    val total = precio * cantidad
    println("El total de la compra es: $$total")
}

fun calcularIMC() {
    println("\nIngrese su peso en kilogramos:")
    val peso = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese su estatura en metros:")
    val estatura = readLine()?.toDoubleOrNull() ?: 0.0

    val imc = if (estatura > 0) peso / (estatura * estatura) else 0.0
    println("Su índice de masa corporal (IMC) es: %.2f".format(imc))
}

fun validarClave() {
    val claveCorrecta = "tesji123"
    println("\nIngrese la clave:")
    val claveIngresada = readLine() ?: ""

    if (claveIngresada == claveCorrecta) {
        println("Acceso permitido.")
    } else {
        println("Acceso denegado.")
    }
}

fun calcularSueldo() {
    println("\nIngrese los días trabajados:")
    val diasTrabajados = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el pago por hora:")
    val pagoPorHora = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese el pago por hora extra:")
    val pagoPorHoraExtra = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese la cantidad de horas extra trabajadas por semana:")
    val horasExtras = readLine()?.toIntOrNull() ?: 0

    val horasExtrasValidas = if (horasExtras <= 5) horasExtras else 5

    val sueldo = (diasTrabajados * 8 * pagoPorHora) + (horasExtrasValidas * pagoPorHoraExtra)
    println("El sueldo total del trabajador es: $$sueldo")
}
