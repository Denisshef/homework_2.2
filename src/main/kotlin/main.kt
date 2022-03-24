fun main() {
    val att = arrayOf(Attach("video"), AttachmentsPhoto("photo"))

    val postOne = Post(
        id = WallService.newId(),
        text = "Text article one",
        attachment = att
    )

    val postTwo = Post(
        id = WallService.newId(),
        text = "Text article two",
    )

    WallService.add(postOne)
    WallService.add(postTwo)
    println(WallService.update(idPost = 1, "New text post"))
}

