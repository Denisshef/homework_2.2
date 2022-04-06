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

    @Test
    fun createComment() {
        // arrange
        WallService.add(Post())
        val idComment = 1

        // act
        val result = WallService.createComment(Comments(post_id = idComment))

        // assert
        assertTrue(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrowException() {
        // arrange
        val idComment = 4

        // act
        val result = WallService.createComment(Comments(post_id = idComment))

        // assert
    }

}