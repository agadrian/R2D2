fun main(args: Array<String>) {

    var r2d2pos: List<Int>

    r2d2pos = moverRobot(10, 5, -2)
    println("x: ${r2d2pos[0]}, y: ${r2d2pos[1]}, dir: ${orientacionRobot(r2d2pos[2])}")

    r2d2pos = moverRobot(0, 0, 0)
    println("x: ${r2d2pos[0]}, y: ${r2d2pos[1]}, dir: ${orientacionRobot(r2d2pos[2])}")

    r2d2pos = moverRobot()
    println("x: ${r2d2pos[0]}, y: ${r2d2pos[1]}, dir: ${orientacionRobot(r2d2pos[2])}")

    r2d2pos = moverRobot(-10,-5,2)
    println("x: ${r2d2pos[0]}, y: ${r2d2pos[1]}, dir: ${orientacionRobot(r2d2pos[2])}")

    r2d2pos = moverRobot(-10,-5,2,4,-8)
    println("x: ${r2d2pos[0]}, y: ${r2d2pos[1]}, dir: ${orientacionRobot(r2d2pos[2])}")

}

fun orientacionRobot(dir: Int) = when (dir){
    0 -> "PositiveY"
    1 -> "NegativeX"
    2 -> "NegativeY"
    3 -> "PositiveX"
    else -> ""
}


/**
 * Descripcion ddfdddf
 * @param movs List<Int> Lista de movimientos que debe realizar el robot
 * @return
 */
// vararg (Argumento variable)
fun moverRobot(vararg movs: Int): List<Int> {

    var posx = 0
    var posy = 0
    var dir = 0 //0 -> PositiveY; 1 -> NegativeX; 2 -> NegativeY; 3 -> PositiveX

    for (pasos in movs) { // cogera cada elemento de la lista movs
        when (dir) {
            0 -> posy += pasos
            1 -> posx -= pasos
            2 -> posy -= pasos
            3 -> posx += pasos
        }

        if (dir == 3) {
            dir = 0
        }
        else{
            dir++
        }


    }
    return listOf(posx, posy, dir)
}