package shapes

import kotlin.math.abs

class Rectangle(
    val point1: Point,
    val point2: Point
) {

    fun getHeight(): Double {
        return abs(point2.y - point1.y)
    }

    fun getWidth(): Double {
        return abs(point2.x - point1.x)
    }

    fun getArea(): Double {
        return abs(getWidth() * getHeight())
    }

    fun move(x: Double, y: Double) {
        point1.movePoint(x, y)
        point2.movePoint(x, y)
    }

}