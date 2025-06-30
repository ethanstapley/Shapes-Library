package shapes

import kotlin.math.PI

open class Ellipse(
    val center: Point,
    val radii1: Double,
    val radii2: Double
) {
    fun getArea(): Double {
        return radii2 * radii1 * PI
    }

    fun move(x: Double, y: Double) {
        center.movePoint(x, y)
    }

}