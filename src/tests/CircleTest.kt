package tests

import org.junit.jupiter.api.Test
import shapes.*
import kotlin.test.*

class CircleTest {
    @Test
    fun testRadius() {
        val circle = Circle(Point(0.0, 0.0), 3.0)
        assertEquals(circle.radii1,3.0)
        assertEquals(circle.radii2, 3.0)
    }
}