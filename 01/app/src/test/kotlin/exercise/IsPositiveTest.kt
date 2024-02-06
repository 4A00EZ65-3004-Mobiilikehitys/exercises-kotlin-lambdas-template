package exercise

import org.junit.jupiter.api.Test

class IsPositiveTest {
    @Test
    fun testIsPositive() {
        var calledSuccess = false
        var calledError = false

        isPositive(5, { calledSuccess = true }, { calledError = true })
        assert(calledSuccess)
        assert(!calledError)

        calledSuccess = false
        calledError = false

        isPositive(-5, { calledSuccess = true }, { calledError = true })
        assert(!calledSuccess)
        assert(calledError)
    }
}
