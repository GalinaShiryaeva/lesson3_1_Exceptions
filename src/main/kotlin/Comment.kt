data class Comment(
    val commentId: Int = 0,
    val ownerId: Int = 3,
    val postId: UInt = 3u,
    val fromGroup: UInt = 0u,
    val message: String = "",
    val replyToComment: Int? = 0,
    val attachments: Array<Attachment>? = null,
    val stickerId: UInt? = null,
    val guid: String = ""
)