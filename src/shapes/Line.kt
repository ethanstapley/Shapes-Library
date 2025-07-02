package shapes

import kotlin.math.pow
import kotlin.math.sqrt

class Line(
    private val point1: Point,
    private val point2: Point
) {
    init {
        if (getLength() <= 0.0) {
            throw IllegalArgumentException("Can't have Line with a Length of '0')")
        }
    }

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

    fun getPoint1(): Point = point1.clonePoint();

    fun getPoint2(): Point = point2.clonePoint();
}
