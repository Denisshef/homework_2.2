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
                posts[index] = post.copy(
                    owner_id = 1,
                    from_id = 2,
                    created_by = 3,
                    text = newText,
                    reply_owner_id = 1,
                    reply_post_id = 1,
                    friends_only = true,
                    comments = Post.Comments(
                        count = 1,
                        can_post = false,
                        groups_can_post = true,
                        can_close = true,
                        can_open = false
                    ),
                    copyright = Post.Copyright(
                        id = 1,
                        link = "refer",
                        name = "Name",
                        type = "News"
                    ),
                    likes = Post.Likes(
                        count = 15,
                        user_likes = true,
                        can_like = true,
                        can_publish = true
                    ),
                    reposts = Post.Reposts(
                        count = 3,
                        user_reposted = false
                    ),
                    views = 40,
                    post_type = "post",
                    can_pin = true,
                    can_delete = false,
                    can_edit = false,
                    is_pinned = true,
                    marked_as_ads = true,
                    is_favorite = true,
                    donut = Post.Donut(
                        is_donut = true,
                        paid_duration = 3,
                        placeholder = "No access",
                        can_publish_free_copy = false,
                        edit_mode = "all"
                    ),
                    postponed_id = 0
                )
                return true
            }
        }
        return false
    }

    fun newId(): Int {
        return id++
    }
}