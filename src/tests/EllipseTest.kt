package tests

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import shapes.Ellipse
import shapes.Point
import kotlin.math.PI
import kotlin.test.assertEquals

class EllipseTest {
    @Test
    fun testAreaError() {
        assertThrows(IllegalArgumentException::class.java) {
            Ellipse(Point(0.0, 0.0), 0.0, 0.0)
        }
    }

    @Test
    fun testArea() {
        val ellipse = Ellipse(Point(0.0, 0.0), 1.0, 2.0)
        assertEquals(ellipse.getArea(), (1.0*2.0*PI))
    }

    @Test
    fun testMove() {
        val ellipse = Ellipse(Point(1.0, 1.0), 1.0, 2.0)
        ellipse.move(2.0, 2.0)
        assertEquals(ellipse.getCenter().x, 3.0)
        assertEquals(ellipse.getCenter().y, 3.0)
    }

    @Test
    fun testGetRadii() {
        val ellipse = Ellipse(Point(1.0, 1.0), 1.0, 2.0)
        assertEquals(ellipse.radii1, 1.0)
        assertEquals(ellipse.radii2, 2.0)
    }
}