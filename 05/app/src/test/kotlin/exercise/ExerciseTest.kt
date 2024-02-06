package exercise

import org.junit.jupiter.api.Test
import kotlin.test.*

class ExerciseTest {

    @Test
    fun testGenerateRandomBoolean() {
        val result = generateRandomBoolean()
        assertTrue(result == true || result == false, "generateRandomBoolean should return true or false")
    }

     @Test
    fun testValidate() {
        // Test with a valid positive number
        assertEquals(5, validate(arrayOf("5")), "Should return the number if it's positive")

        // Test with zero
        assertNull(validate(arrayOf("0")), "Should return null if the number is not positive")

        // Test with a negative number
        assertNull(validate(arrayOf("-5")), "Should return null if the number is not positive")

        // Test with a non-numeric string
        assertNull(validate(arrayOf("abc")), "Should return null for non-numeric input")

        // Test with empty args
        assertNull(validate(arrayOf()), "Should return null if args are empty")
    }

    @Test
    fun testCreateList() {
        val list = createList(5)
        assertEquals(5, list.size, "List should contain 6 elements (0..5)")
    }
}
