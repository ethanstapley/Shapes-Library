package tests

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import shapes.*
import kotlin.test.*

class TriangleTest {
    @Test
    fun areaTestError() {
        assertThrows(IllegalArgumentException::class.java) {
            Triangle(Point(0.0, 0.0), Point(0.0, 0.0), Point(0.0, 0.0))
        }
    }

    @Test
    fun areaTest() {
        val area = Triangle(Point(0.0, 0.0), Point(2.0, 0.0), Point(0.0, 2.0)).getArea()
        assertEquals(area, 2.0)
    }

    @Test
    fun moveTest() {
        val triangle = Triangle(Point(0.0, 0.0), Point(2.0, 0.0), Point(0.0, 2.0))
        triangle.move(2.0, 2.0)
        assertEquals(triangle.getPoint1().x, 2.0)
        assertEquals(triangle.getPoint1().y, 2.0)
        assertEquals(triangle.getPoint2().x, 4.0)
        assertEquals(triangle.getPoint2().y, 2.0)
        assertEquals(triangle.getPoint3().x, 2.0)
        assertEquals(triangle.getPoint3().y, 4.0)
    }
}