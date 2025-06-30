package shapes

class Square(
    point: Point,
    val length: Double
) : Rectangle(
    point,
    Point(point.x + length, point.y + length)
) {

}

