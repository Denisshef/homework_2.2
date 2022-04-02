fun main() {
    val att = arrayOf(Attach("video"), AttachmentsPhoto("photo"))
    val firstPost = WallService.add(Post(attachment = att))
    val secondPost = WallService.add(Post())

    println(WallService.update(firstPost))
}

