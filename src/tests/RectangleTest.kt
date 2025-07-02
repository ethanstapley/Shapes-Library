package tests
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import shapes.*
import kotlin.test.*

class RectangleTest {

    @Test
    fun testAreaError() {
        assertThrows(IllegalArgumentException::class.java) {
            Rectangle(Point(0.0, 0.0), Point(4.0, 0.0))
        }
        assertThrows(IllegalArgumentException::class.java) {
            Rectangle(Point(1.0, 0.0), Point(1.0, 4.0))
        }
    }

    @Test
    fun testArea() {
        val area = Rectangle(Point(0.0, 0.0), Point(4.0, 8.0)).getArea()
        assertEquals(area, 32.0)
    }

    @Test
    fun testMove() {
        val rectangle = Rectangle(Point(0.0, 0.0), Point(3.0, 6.0))
        rectangle.move(1.0, 1.0)
        assertEquals(rectangle.getPoint1().x, 1.0)
        assertEquals(rectangle.getPoint1().y, 1.0)
        assertEquals(rectangle.getPoint2().x, 4.0)
        assertEquals(rectangle.getPoint2().y, 7.0)
    }
}