package tests

import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import shapes.*
import kotlin.test.*

class SquareTest {
    @Test
    fun testPoints() {
        val square = Square(Point(0.0, 0.0), 5.0)
        assertEquals(square.getPoint1().x, 0.0)
        assertEquals(square.getPoint1().y, 0.0)
        assertEquals(square.getPoint2().x, 5.0)
        assertEquals(square.getPoint2().y, 5.0)
    }
}