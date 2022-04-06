data class Comments(
    val owner_id: Int = 0,
    val post_id: Int,
    val from_group: Int = 0,
    val message: String? = null,
    val reply_to_comment: Int = 0,
    val attachments: String? = null,
    val sticker_id: Int = 0,
    val guid: String = "n"
)