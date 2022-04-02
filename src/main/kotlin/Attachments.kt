interface Attachments {
    val type: String
}

open class Attach(
    override val type: String,
    val id: Int = 0,
    val album_id: Int = 0,
    val owner_id: Int = 0,
    val user_id: Int = 0
) : Attachments

class AttachmentsPhoto(
    override val type: String
) : Attach("Photo")

class AttachmentsVideo(
    override val type: String,

) : Attach("Video")

class AttachmentsAudio(
    override val type: String,

) : Attach("Audio")

class AttachmentsDoc(
    override val type: String,

) : Attach("Doc")

class AttachmentsLink(
    override val type:String,

) : Attach("Link")

class AttachmentsPoll(
    override val type: String,

) : Attach("Poll")