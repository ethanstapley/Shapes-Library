package tests

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import shapes.*
import kotlin.test.*

class LineTest {

    @Test
    fun testLengthError() {
        assertThrows(IllegalArgumentException::class.java) {
            Line(Point(0.0, 0.0), Point(0.0, 0.0))
        }
    }

    @Test
    fun testGetLinePoints() {
        val line = Line(Point(0.0, 0.0), Point(1.0, 1.0))
        assertEquals(line.getPoint1().x, 0.0)
        assertEquals(line.getPoint1().y, 0.0)
        assertEquals(line.getPoint2().x, 1.0)
        assertEquals(line.getPoint2().y, 1.0)
    }

    @Test
    fun testLength() {
        val line = Line(Point(0.0, 0.0), Point(3.0, 4.0))
        assertEquals(line.getLength(), 5.0)
    }

    @Test
    fun testSlope() {
        val line = Line(Point(0.0, 0.0), Point(3.0, 3.0))
        assertEquals(line.getSlope(), 1.0)
    }

    @Test
    fun testMove() {
        val line = Line(Point(0.0, 0.0), Point(3.0, 3.0))
        line.move(1.0, 1.0)
        assertEquals(line.getPoint1().x, 1.0)
        assertEquals(line.getPoint1().y, 1.0)
        assertEquals(line.getPoint2().x, 4.0)
        assertEquals(line.getPoint2().y, 4.0)
    }
}