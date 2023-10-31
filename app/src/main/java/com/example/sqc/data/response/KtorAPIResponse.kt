package com.example.sqc.data.response


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class KtorAPIResponse(
    @SerialName("data")
    val `data`: Data? = null,
    @SerialName("message")
    val message: String? = null, // Login Successfully.
    @SerialName("status")
    val status: Boolean? = null // true
) {
    @Serializable
    data class Data(
        @SerialName("token")
        val token: String? = null, // eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiYjI4ZmU4NTE2YzE3ZWJmNWE4OTNmMTMwZmE2Nzg1MTFkMGVkNTU0NjJkNjdkZGVhYmQxZWE2MzBjN2JjOTczY2IyZjQ0ZGUyODA0ZWFjMjMiLCJpYXQiOjE2OTg3MjgxMzguMTg4NjY4LCJuYmYiOjE2OTg3MjgxMzguMTg4NjcyLCJleHAiOjE3MzAzNTA1MzguMTgzMjIsInN1YiI6IjgzNSIsInNjb3BlcyI6W119.ESzkgt6u3kYlJx61xQJDH-YvYfUpl5yrA-Uc3ABQGvf08ctbDN4TR5wkld7n-4gzIAcwMEuu9WhByiTBDfkjUG-wZ_pBCd1BQxA68x7XYFqUheFnOr14-BhkIhvAw3ANjJS3wE94YCyQW6eCX6dDwUsS0DUZruIlZTQw9fQ-eBZY4in9Vl6RFGKwA7_pmSDOSaW3K7sUO8TCSHex4OOVT7fd3g7QmlDJzH8FF1B3cDCJPw4447oHqVTcj2YW-npSJCwt8rfqdBlaf83DQZyTrgvIepOebRv8aW6x-UdbaTS96kfsMOL25IWS6paj1GsKlcuQAoJ0bnCmORb_btR1n2W0PWE6VA0lHbv5EZ-9M2nBnz6pvd2L6fLagTErQm9wp7RjfUfQkQ-m_9PVN9X8zW1PGZiwp5F8Bl-dWMs9tyYjklFJ_R8aUgw__xEU_4PzNW4-gvHzUkFdDLknOtVFawiZuhA70MOwq2Cy0gBlDMs48nVm5gytOIuMnZjYCJ2gLtwEXjGxDgiYADz_OIbP-IixZmMRwKAxwu9CCF9udE2L0lLSdmZFJxnGTxXxvUx22ASLsnQnGvcKLRASuRhx6bgy9XwWD9h5Uc073IsMlSdHD-cbSKtSW58lT7tV9d8wACjhFjZ9ULioPMgV2gutygi6moQ9bKH-m216Fdb9_Zc
        @SerialName("user")
        val user: User? = null
    ) {
        @Serializable
        data class User(
            @SerialName("accepted_state")
            @Contextual
            val acceptedState: Any? = null, // null
            @SerialName("address")
            @Contextual
            val address: Any? = null, // null
            @SerialName("city")
            @Contextual
            val city: Any? = null, // null
            @SerialName("community")
            @Contextual
            val community: Any? = null, // null
            @SerialName("community_id")
            @Contextual
            val communityId: Any? = null, // null
            @SerialName("country")
            @Contextual
            val country: Any? = null, // null
            @SerialName("country_code")
            val countryCode: String? = null, // +65
            @SerialName("countrydata")
            @Contextual
            val countrydata: Any? = null, // null
            @SerialName("created_at")
            val createdAt: String? = null, // 2023-05-26T06:25:19.000000Z
            @SerialName("deleted_at")
            @Contextual
            val deletedAt: Any? = null, // null
            @SerialName("dob")
            val dob: String? = null, // 27 / 09 / 2023
            @SerialName("e_country_code")
            @Contextual
            val eCountryCode: Any? = null, // null
            @SerialName("e_email")
            @Contextual
            val eEmail: Any? = null, // null
            @SerialName("e_first_name")
            @Contextual
            val eFirstName: Any? = null, // null
            @SerialName("e_last_name")
            @Contextual
            val eLastName: Any? = null, // null
            @SerialName("e_mobile_no")
            @Contextual
            val eMobileNo: Any? = null, // null
            @SerialName("e_relationship")
            @Contextual
            val eRelationship: Any? = null, // null
            @SerialName("email")
            val email: String? = null, // Tanya@singsys.com
            @SerialName("email_verified_at")
            @Contextual
            val emailVerifiedAt: Any? = null, // null
            @SerialName("first_name")
            val firstName: String? = null, // tanya
            @SerialName("gender")
            val gender: String? = null, // Female
            @SerialName("hidebirthday")
            val hidebirthday: String? = null, // false
            @SerialName("hobbies")
            @Contextual
            val hobbies: Any? = null, // null
            @SerialName("id")
            val id: Int? = null, // 835
            @SerialName("industry")
            @Contextual
            val industry: Any? = null, // null
            @SerialName("interests")
            @Contextual
            val interests: Any? = null, // null
            @SerialName("is_online")
            val isOnline: String? = null, // no
            @SerialName("is_reset_pass")
            val isResetPass: String? = null, // no
            @SerialName("last_name")
            val lastName: String? = null, // nigam
            @SerialName("mobile_no")
            val mobileNo: String? = null, // 8874345283
            @SerialName("mobile_no_verified_at")
            @Contextual
            val mobileNoVerifiedAt: Any? = null, // null
            @SerialName("occupation")
            @Contextual
            val occupation: Any? = null, // null
            @SerialName("on_chat_screen")
            @Contextual
            val onChatScreen: Any? = null, // null
            @SerialName("permission_ids")
            @Contextual
            val permissionIds: Any? = null, // null
            @SerialName("personal_proclamation_of_faith_date")
            @Contextual
            val personalProclamationOfFaithDate: Any? = null, // null
            @SerialName("profile_pic")
            val profilePic: String? = null, // https://everynation.s3.ap-southeast-1.amazonaws.com/images/upload/ExG6q5zBU6jAJCvS9ChoMTkLMv7kdRzlNe8rKtjY.jpg
            @SerialName("public_proclamation_of_faith_date")
            @Contextual
            val publicProclamationOfFaithDate: Any? = null, // null
            @SerialName("referred_id")
            @Contextual
            val referredId: Any? = null, // null
            @SerialName("role_id")
            @Contextual
            val roleId: Any? = null, // null
            @SerialName("socket_id")
            @Contextual
            val socketId: Any? = null, // null
            @SerialName("sqid")
            val sqid: String? = null, // SG2023835
            @SerialName("state")
            @Contextual
            val state: Any? = null, // null
            @SerialName("status")
            val status: String? = null, // active
            @SerialName("tokens")
            val tokens: List<Token?>? = null,
            @SerialName("type")
            val type: String? = null, // guide
            @SerialName("updated_at")
            val updatedAt: String? = null, // 2023-10-30T10:51:36.000000Z
            @SerialName("zip_code")
            @Contextual
            val zipCode: Any? = null // null
        ) {
            @Serializable
            data class Token(
                @SerialName("client_id")
                val clientId: Int? = null, // 3
                @SerialName("created_at")
                val createdAt: String? = null, // 2023-10-31 04:44:25
                @SerialName("expires_at")
                val expiresAt: String? = null, // 2024-10-31T04:44:25.000000Z
                @SerialName("id")
                val id: String? = null, // 32572b6a2bf98a07251d251b8c03f5cf57102c09ff4ce242a9d037bb13decf9c546e33ebee3052e7
                @SerialName("name")
                val name: String? = null, // My App
                @SerialName("revoked")
                val revoked: Boolean? = null, // true
                @SerialName("scopes")
                val scopes: List<String?>? = null,
                @SerialName("updated_at")
                val updatedAt: String? = null, // 2023-10-31 04:44:25
                @SerialName("user_id")
                val userId: Int? = null // 835
            )
        }
    }
}