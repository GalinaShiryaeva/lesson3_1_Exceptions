import org.junit.Test
import org.junit.Assert.*

class MainKtTest {

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        // arrange
        WallService.add(Post(76))

        // act
        WallService.createComment(Comment(0, 3, 222))
    }

    @Test
    fun shouldNotThrow() {
        // arrange
        WallService.add(Post(76))

        // act
        val comment1 = WallService.createComment(Comment(0, 3, 76))

        // assert
        assertTrue("Несуществующий id поста!", comment1)
    }
}