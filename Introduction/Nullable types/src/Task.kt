fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {

    val personalInfo: PersonalInfo? = client?.personalInfo ?: return

    if (message != null) {

        val email: String = personalInfo?.email ?: return
        mailer.sendMessage(email, message)
    } else {
        return
    }


}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
