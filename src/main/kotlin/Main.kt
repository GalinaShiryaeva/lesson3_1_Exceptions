fun main() {
    var id: Long = 0
    var attachmentId: Int = 0

    // заполняем массив
    for (i in 0..5) {
        WallService.add(Post(++id))
    }
    WallService.update(Post(5))
    //WallService.printPosts()

    var arrayOfAttachments1 = emptyArray<Attachment>()
    var arrayOfAttachments2 = emptyArray<Attachment>()

    arrayOfAttachments1 += VideoAttachment( ++attachmentId, 5, 6, 7)
    arrayOfAttachments1 += PhotoAttachment( ++attachmentId, 4, 2, 9)
    arrayOfAttachments1 += MapAttachment( ++attachmentId, 3, 8, 1)

    arrayOfAttachments2 += FileAttachment( ++attachmentId, 3, 4, 2)
    arrayOfAttachments2 += AudioAttachment( ++attachmentId, 1, 2, 8)

    val somePost1 = WallService.add(Post(++id, arrayOfAttachments1))
    val somePost2 = WallService.add(Post(++id, arrayOfAttachments2))

    WallService.printPosts()
}