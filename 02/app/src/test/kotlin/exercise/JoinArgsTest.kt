package exercise

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class JoinArgsTest {
    @Test
    fun testJoinArgs() {
        assertEquals("ONE\nTWO\nTHREE", joinArgs(arrayOf("one", "two", "three", "fourteen")))
        assertEquals("", joinArgs(arrayOf("sixteen", "seventeen")))
        assertEquals("A\nB", joinArgs(arrayOf("a", "b")))
        assertEquals("", joinArgs(arrayOf<String>()))
    }
}
