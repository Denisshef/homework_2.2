object WallService {
    var posts = emptyArray<Post>()
    private var id: Int = 1

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun update(idPost: Int, newText: String = ""): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == idPost) {
                posts[index] = post.copy(text = newText)
                return true
            }
        }
        return false
    }

    fun newId(): Int {
        return id++
    }
}