package shapes

import kotlin.math.pow
import kotlin.math.sqrt

class Line(
    private val point1: Point,
    private val point2: Point
) {

    fun getSlope(): Double {
        return (point2.x - point1.x) / (point2.y - point1.y)
    }

    fun getLength(): Double {
        return sqrt((point2.x - point1.x).pow(2.0) + (point2.y - point1.y).pow(2.0))
    }

    fun move(x: Double, y: Double) {
        point1.movePoint(x, y)
        point2.movePoint(x, y)
    }
}