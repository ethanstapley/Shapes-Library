package shapes

import kotlin.math.PI

open class Ellipse(
    private val center: Point,
    val radii1: Double,
    val radii2: Double
) {
    init {
        if (getArea() <= 0.0) {
            throw IllegalArgumentException("Can't have Shape with an Area of '0')")
        }
    }

    fun getArea(): Double {
        return radii2 * radii1 * PI
    }

    fun move(x: Double, y: Double) {
        center.movePoint(x, y)
    }

    fun center(): Point {
        return center().clonePoint();
    }
}