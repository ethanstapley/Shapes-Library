package shapes

class Point (
    val x: Double,
    val y: Double
) {
    fun clonePoint(): Point {
        return Point(x, y)
    }

    fun movePoint(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }
}