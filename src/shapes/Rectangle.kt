package shapes

import kotlin.math.abs

open class Rectangle(
    private val point1: Point,
    private val point2: Point
) {
    init {
        if (getArea() <= 0.0) {
            throw IllegalArgumentException("Can't have Shape with an Area of '0')")
        }
    }

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

    fun getPoint1(): Point = point1.clonePoint();

    fun getPoint2(): Point = point2.clonePoint();

}