import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {
    @Test
    fun add() {
        // arrange
        val post = Post()

        // act
        val result = WallService.add(post)

        // assert
        assertTrue(result.id != 0)
    }

    @Test
    fun updateTrue() {
        // arrange
        val post = WallService.add(Post())

        // act
        val result = WallService.update(post)

        // assert
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        // arrange
        val post = Post()

        // act
        val result = WallService.update(post)

        // assert
        assertFalse(result)
    }
}