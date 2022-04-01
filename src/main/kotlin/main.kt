fun main() {
    val firstPost = WallService.add(Post())
    val secondPost = WallService.add(Post())

    println(WallService.update(firstPost))
}

