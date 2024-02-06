package exercise

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class LottoTest {
    @Test
    fun `test toInt with valid numbers`() {
        val input = arrayOf("1", "2", "3")
        val expected = listOf(1, 2, 3)
        assertEquals(expected, input.toInt())
    }

    @Test
    fun `test toInt with invalid numbers`() {
        val input = arrayOf("1", "a", "3")
        assertNull(input.toInt())
    }

    @Test
    fun `test checkIfValidLottoNumbers with valid input`() {
        val input = arrayOf("1", "2", "3", "4", "5", "6", "7")
        val expected = setOf(1, 2, 3, 4, 5, 6, 7)
        assertEquals(expected, input.checkIfValidLottoNumbers())
    }

    @Test
    fun `test checkIfValidLottoNumbers with invalid input`() {
        val input = arrayOf("1", "2", "3", "4", "5", "6", "6")
        assertNull(input.checkIfValidLottoNumbers())
    }

    @Test
    fun `test checkIfValidLottoNumbers with less numbers`() {
        val input = arrayOf("1", "2", "3", "4", "5", "6")
        assertNull(input.checkIfValidLottoNumbers())
    }

    @Test
    fun `test checkIfValidLottoNumbers with more numbers`() {
        val input = arrayOf("1", "2", "3", "4", "5", "6", "7", "8")
        assertNull(input.checkIfValidLottoNumbers())
    }

    @Test
    fun `test howMany with matching numbers`() {
        val set1 = setOf(1, 2, 3, 4, 5)
        val set2 = setOf(4, 5, 6, 7, 8)
        assertEquals(2, set1.howMany(set2))
    }

    @Test
    fun `test howMany with no matching numbers`() {
        val set1 = setOf(1, 2, 3)
        val set2 = setOf(4, 5, 6)
        assertEquals(0, set1.howMany(set2))
    }

    @Test
    fun `test addPadding`() {
        val numbers = setOf(1, 12, 123)
        val expected = "[001, 012, 123]"
        assertEquals(expected, numbers.addPadding(3))
    }

    @Test
    fun testFormatTime() {
        // Test for 1 week (less than a year)
        assertEquals("0 years", formatTime(1.0))

        // Test for exactly 52 weeks (1 year)
        assertEquals("1 year", formatTime(52.0))

        // Test for 1.5 years (78 weeks)
        assertEquals("1 year", formatTime(78.0))

        // Test for 2 years (104 weeks)
        assertEquals("2 years", formatTime(104.0))

        // Test for 5.5 years (286 weeks)
        assertEquals("5 years", formatTime(286.0))

        // Test for 0 weeks
        assertEquals("0 years", formatTime(0.0))

        // Test for negative weeks
        assertEquals("0 years", formatTime(-10.0))
    }
}
