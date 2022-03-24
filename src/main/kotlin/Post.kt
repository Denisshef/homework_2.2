data class Post(
    val id: Int,
    val owner_id: Int = 1,
    val from_id: Int = 12,
    val created_by: Int = 5,
    val date: Int = 2022,
    val text: String,
    val reply_owner_id: Int = 1,
    val reply_post_id: Int = 1,
    val friends_only: Boolean = true,
    val comments: Comments? = null,
    val copyright: Copyright? = null,
    val likes: Likes = Likes(),
    val reposts: Reposts? = null,
    val views: Int = 0,
    val post_type: String = "post",
    val can_pin: Boolean = false,
    val can_delete: Boolean = false,
    val can_edit: Boolean = true,
    val is_pinned: Boolean = true,
    val marked_as_ads: Boolean = false,
    val is_favorite: Boolean = false,
    val donut: Donut? = Donut(),
    val postponed_id: Int = 1,
    val attachment: Array<Attach>? = null
) {

    data class Comments(
        val count: Int = 0,
        val can_post: Boolean = false,
        val groups_can_post: Boolean = false,
        val can_close: Boolean = false,
        val can_open: Boolean = false
    )

    data class Copyright(
        val id: Int = 0,
        val link: String = "link",
        val name: String = "name",
        val type: String = "type",
    )

    data class Likes(
        val count: Int = 0,
        val user_likes: Boolean = false,
        val can_like: Boolean = false,
        val can_publish: Boolean = false,
    )

    data class Reposts(
        val count: Int = 0,
        val user_reposted: Boolean = false
    )

    data class Donut(
        val is_donut: Boolean = false,
        val paid_duration: Int = 0,
        val placeholder: String = "No access",
        val can_publish_free_copy: Boolean = false,
        val edit_mode: String = "post"
    )

    override fun toString(): String {
        return "Text post = $text"
    }
}