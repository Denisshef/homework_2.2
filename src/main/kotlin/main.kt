fun main() {
    val att = arrayOf(Attach("video"), AttachmentsPhoto("photo"))
    val firstPost = WallService.add(Post(attachment = att))
    val secondPost = WallService.add(Post())

    WallService.createComment(Comments(post_id = 3))
    WallService.update(firstPost)
}

