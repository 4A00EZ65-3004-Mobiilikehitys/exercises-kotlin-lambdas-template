package exercise

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SumTest {
    @Test
    fun testSum() {
        sum(1, 2) { result ->
            assertEquals("result was = 3", result)
        }

        sum(-1, -2) { result ->
            assertEquals("result was = -3", result)
        }

        sum(0, 0) { result ->
            assertEquals("result was = 0", result)
        }
    }
}
