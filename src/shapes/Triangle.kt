package shapes

import kotlin.math.abs

class Triangle(
    val point1: Point,
    val point2: Point,
    val point3: Point
) {
    init {
        if (getArea() <= 0.0) {
            throw IllegalArgumentException("Can't have Shape with an Area of '0')")
        }
    }

    fun getArea(): Double {
        val x1 = point1.x
        val x2 = point2.x
        val x3 = point3.x
        val y1 = point1.y
        val y2 = point2.y
        val y3 = point3.y
        return .5 * abs((x1*y2 + x2*y3 + x3*y1) - (y1*x2 + y2*x3 + y3*x1))
    }

    fun move(x: Double, y: Double) {
        point1.movePoint(x, y)
        point2.movePoint(x, y)
        point3.movePoint(x, y)
    }
}