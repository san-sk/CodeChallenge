import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class LeetCodeKtTest {

    @BeforeEach
    fun setUp() {

    }

    @AfterEach
    fun tearDown() {
    }


    @ParameterizedTest
    @DisplayName("First Missing Positive")
    @MethodSource("TestDataProvider#getFirstMissingPositiveTestData")
    fun testFirstMissingPositive(input: IntArray, expected: Int) {
        assertEquals(expected, firstMissingPositive(input))
    }

}