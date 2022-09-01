import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

object TestDataProvider {

    @JvmStatic
    fun getFirstMissingPositiveTestData(): Stream<Arguments> = Stream.of(
        Arguments.of(intArrayOf(1, 2, 3), 4),
        Arguments.of(intArrayOf(-10, 30, 20), 1),
        Arguments.of(intArrayOf(15, -5, 10), 1),
        Arguments.of(intArrayOf(-5, -10, -15), 1),
        Arguments.of(intArrayOf(3, 4, -1, 1), 2),
        Arguments.of(intArrayOf(17, 8, 9, 11, 12), 1),
        Arguments.of(intArrayOf(1, 2, 0), 3),
        Arguments.of(intArrayOf(1, 2, Int.MAX_VALUE), 3),
    )
}