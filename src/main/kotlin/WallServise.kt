object WallService {
    private var posts = emptyArray<Post>()
	private var arr = emptyArray<Attach>()
    private var id: Int = 0

    fun add(post: Post): Post {
        posts += post.copy(id = ++id)
        return posts.last()
    }

    fun update(editPost: Post): Boolean {
        for ((index, oldPost: Post) in posts.withIndex()) {
            if (editPost.id == oldPost.id) {
                posts[index] = editPost.copy(
                    owner_id = oldPost.owner_id,
                    date = oldPost.date
                )
                return true
            }
        }
        return false
    }
}