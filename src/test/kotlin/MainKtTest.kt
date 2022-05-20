import org.junit.Test

class MainKtTest {

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        //arrange
        val post1 = WallService.findPostById(76u)



        // act

        // assert
    }
}