package shapes

class Point (
    x: Double,
    y: Double
) {
    var x: Double = x
        private set

    var y: Double = y
        private set

    fun clonePoint(): Point {
        return Point(x, y)
    }

    fun movePoint(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }
}