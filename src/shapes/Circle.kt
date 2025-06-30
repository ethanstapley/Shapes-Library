package shapes

class Circle(
    point: Point,
    val radii: Double
) : Ellipse(
    point,
    radii,
    radii
)
