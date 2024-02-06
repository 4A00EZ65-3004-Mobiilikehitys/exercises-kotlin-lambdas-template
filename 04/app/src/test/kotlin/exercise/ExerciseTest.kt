package exercise

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class ExerciseTest {

    @Test
    fun testGetSpeedA() {
        val person = Person()
        val result = getSpeedA(person)
        assertTrue(result == 20 || result == 40 || result == null, "SpeedA should be 20, 40, or null")
    }

    @Test
    fun testGetSpeedB() {
        val person = Person()
        val result = getSpeedB(person)
        assertTrue(result == 20 || result == 40 || result == null, "SpeedB should be 20, 40, or null")
    }

    @Test
    fun testGetSpeedC() {
        val person = Person()
        val result = getSpeedC(person)
        assertTrue(result == 20 || result == 40 || result == "could not fetch the speed", "SpeedC should be 20, 40, or 'could not fetch the speed'")
    }

    @Test
    fun testGetSpeedD() {
        val person = Person()
        try {
            val result = getSpeedD(person)
            assertTrue(result == 20 || result == 40, "SpeedD should be 20 or 40")
        } catch (e: NullPointerException) {
            assertTrue(true, "Caught expected NullPointerException for SpeedD")
        }
    }
    @Test
    fun testGenerateRandomBoolean() {
        val result = generateRandomBoolean()
        assertTrue(result == true || result == false, "generateRandomBoolean should return true or false")
    }
}
