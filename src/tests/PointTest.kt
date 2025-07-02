package tests

import org.junit.jupiter.api.Test
import shapes.*
import kotlin.test.*

class PointTest {

    @Test
    fun testMove() {
        val p = Point(0.0, 0.0)
        p.movePoint(3.0, -6.0)
        assertEquals(3.0, p.x)
        assertEquals(-6.0, p.y)
    }

    @Test
    fun testClone() {
        val p = Point(1.0, 1.0)
        val p1 = p.clonePoint()
        assertEquals(p1.x, p.x)
        assertEquals(p1.y, p.y)
    }
}