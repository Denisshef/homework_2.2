import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun newId() {
        // arrange

        // act
        val result1 = WallService.newId()
        val result2 = WallService.newId()

        // assert
        if ((result2 - result1) == 1)
            assert(true)
        else
            assert(false)
    }

    @Test
    fun add() {
        // arrange
        val idPost = WallService.newId()
        val post = Post(
            id = idPost,
            text = "Text article"
        )
        // act
        val result = WallService.add(post)

        // assert
        assert(result.id == idPost)
    }

    @Test
    fun updateTrue() {
        // arrange
        val id = 2
        val post1 = Post(id = 1, text = "text one")
        val post2 = Post(id = 2, text = "text two")

        // act
        WallService.add(post1)
        WallService.add(post2)

        val result = WallService.update(
            idPost = id
        )

        // assert
        assert(result)
    }

    @Test
    fun updateFalse() {
        // arrange
        val id = 1
        val post1 = Post(id = 1, text = "text one")
        val post2 = Post(id = 2, text = "text two")

        // act
        WallService.add(post1)
        WallService.add(post2)

        val result = WallService.update(
            idPost = id
        )

        // assert
        assert(!result)
    }
}