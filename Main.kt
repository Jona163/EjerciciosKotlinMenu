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
