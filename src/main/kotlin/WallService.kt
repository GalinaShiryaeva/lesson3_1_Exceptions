object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    @Throws(PostNotFoundException::class)
    fun createComment(comment: Comment): Boolean {
        var counter: Int = 0
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
                counter++
                return true
            }
        }
        if (counter == 0) {
            throw PostNotFoundException("пост не найден!")
        }
        return false
    }

    //    fun findPostById(id: Int): Post? {
//        if (posts.isNotEmpty()) {
//            for (post in posts) {
//                if (post.id == id) {
//                    return post
//                }
//            }
//        }
//        return null.also{
//            println("Пост не найден")
//        }
//    }
    fun findPostById(id: Int): Boolean {
        if (posts.isNotEmpty()) {
            for (post in posts) {
                if (post.id == id) {
                    return true
                }
            }
        }
        return false
    }

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (p in posts) {
            if (post.id == p.id) {
                p.owner_id = 3
                p.from_id = 5
                // и т.д. по свойствам
                return true
            }
        }
        return false
    }

    fun printPosts() {
        for (post in posts) {
            println(post)
        }
    }
}