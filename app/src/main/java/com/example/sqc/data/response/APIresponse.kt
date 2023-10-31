package com.example.sqc.data.response


import com.google.gson.annotations.SerializedName

data class APIresponse(
    @SerializedName("data")
    val `data`: Data? = null,
    @SerializedName("message")
    val message: String? = null, // Login Successfully.
    @SerializedName("status")
    val status: Boolean? = null // true
) {
    data class Data(
        @SerializedName("token")
        val token: String? = null, // eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiZDVhZTdkMzQ2ZGViZjhjZWU3NjJiNWY2MjU2YTk2MDNhMWE0YTI2OWJiNDcyN2I0NTExMjFmZGRkNjVjMjE4YWQ3NjZmZmJmZTczYWJkZDEiLCJpYXQiOjE2OTg3MjcxNDAuNjQxNDM3LCJuYmYiOjE2OTg3MjcxNDAuNjQxNDQxLCJleHAiOjE3MzAzNDk1NDAuNjM1Nzg5LCJzdWIiOiI4MzUiLCJzY29wZXMiOltdfQ.S0CeHdzip0et_qaYlXm1YwSYE9t1lcV6HGICukEZCzSaeTp_X2WXfubH9lOoodDRfI3lte08G0iKTgtO3K8dsHfSL4iF-4r7v-VGypHS_U1WU2GRCwSvrfm-aFqKqgdAC51PqGM6hkEMEQDWnFSOw3q6Rq-7uy0axm3-PhCTy0H-pg3B6Zir-Wh19QgJbCgM8aND4fh18ndlqW87F-3zLgCec41RoeLXt_tBYdgcGWSF9edcbWBQjRlTEwhuylwh0OOZ2vth3OqX61xhm7-Po2DH4sTHaiuhOywrab6HKdHNky7lvwzvvD1RAwiFIbS4Oyl_vPulbb5XfEOUa948JVLwPt1oQqWQfykH096BBjQ1xTcweUhHRst9lOMl9i1uARGdPvdriJIQruTKqbm_NXQ6McWtapWOIZOtoJxT3Tw3yVLqcGxPfPiL-e3VruRPzkh35pAMKx02TzNc3LQZuGAYDy4fwzXs-IBgqDRtH48aXJ1Wba0qIwCtebdFds3uDs1BAknELQjwgJJIKJ7O0QamnVR4omnWf0bgJUWYBs2_U8Jf0yAvwAKGihvemnWEEnIayOdrb19qyhJQyGG4wvaBJKGcpsQF768vJAg71vUn2NEmaJDQtMpC95R3IULYxOhH4JE2F6X1TRmeQ8yA8DahYKo97OjbTxrZ2vIWEBs
        @SerializedName("user")
        val user: User? = null
    ) {
        data class User(
            @SerializedName("accepted_state")
            val acceptedState: Any? = null, // null
            @SerializedName("address")
            val address: Any? = null, // null
            @SerializedName("city")
            val city: Any? = null, // null
            @SerializedName("community")
            val community: Any? = null, // null
            @SerializedName("community_id")
            val communityId: Any? = null, // null
            @SerializedName("country")
            val country: Any? = null, // null
            @SerializedName("country_code")
            val countryCode: String? = null, // +65
            @SerializedName("countrydata")
            val countrydata: Any? = null, // null
            @SerializedName("created_at")
            val createdAt: String? = null, // 2023-05-26T06:25:19.000000Z
            @SerializedName("deleted_at")
            val deletedAt: Any? = null, // null
            @SerializedName("dob")
            val dob: String? = null, // 27 / 09 / 2023
            @SerializedName("e_country_code")
            val eCountryCode: Any? = null, // null
            @SerializedName("e_email")
            val eEmail: Any? = null, // null
            @SerializedName("e_first_name")
            val eFirstName: Any? = null, // null
            @SerializedName("e_last_name")
            val eLastName: Any? = null, // null
            @SerializedName("e_mobile_no")
            val eMobileNo: Any? = null, // null
            @SerializedName("e_relationship")
            val eRelationship: Any? = null, // null
            @SerializedName("email")
            val email: String? = null, // Tanya@singsys.com
            @SerializedName("email_verified_at")
            val emailVerifiedAt: Any? = null, // null
            @SerializedName("first_name")
            val firstName: String? = null, // tanya
            @SerializedName("gender")
            val gender: String? = null, // Female
            @SerializedName("hidebirthday")
            val hidebirthday: String? = null, // false
            @SerializedName("hobbies")
            val hobbies: Any? = null, // null
            @SerializedName("id")
            val id: Int? = null, // 835
            @SerializedName("industry")
            val industry: Any? = null, // null
            @SerializedName("interests")
            val interests: Any? = null, // null
            @SerializedName("is_online")
            val isOnline: String? = null, // no
            @SerializedName("is_reset_pass")
            val isResetPass: String? = null, // no
            @SerializedName("last_name")
            val lastName: String? = null, // nigam
            @SerializedName("mobile_no")
            val mobileNo: String? = null, // 8874345283
            @SerializedName("mobile_no_verified_at")
            val mobileNoVerifiedAt: Any? = null, // null
            @SerializedName("occupation")
            val occupation: Any? = null, // null
            @SerializedName("on_chat_screen")
            val onChatScreen: Any? = null, // null
            @SerializedName("permission_ids")
            val permissionIds: Any? = null, // null
            @SerializedName("personal_proclamation_of_faith_date")
            val personalProclamationOfFaithDate: Any? = null, // null
            @SerializedName("profile_pic")
            val profilePic: String? = null, // https://everynation.s3.ap-southeast-1.amazonaws.com/images/upload/ExG6q5zBU6jAJCvS9ChoMTkLMv7kdRzlNe8rKtjY.jpg
            @SerializedName("public_proclamation_of_faith_date")
            val publicProclamationOfFaithDate: Any? = null, // null
            @SerializedName("referred_id")
            val referredId: Any? = null, // null
            @SerializedName("role_id")
            val roleId: Any? = null, // null
            @SerializedName("socket_id")
            val socketId: Any? = null, // null
            @SerializedName("sqid")
            val sqid: String? = null, // SG2023835
            @SerializedName("state")
            val state: Any? = null, // null
            @SerializedName("status")
            val status: String? = null, // active
            @SerializedName("tokens")
            val tokens: List<Token?>? = null,
            @SerializedName("type")
            val type: String? = null, // guide
            @SerializedName("updated_at")
            val updatedAt: String? = null, // 2023-10-30T10:51:36.000000Z
            @SerializedName("zip_code")
            val zipCode: Any? = null // null
        ) {
            data class Token(
                @SerializedName("client_id")
                val clientId: Int? = null, // 3
                @SerializedName("created_at")
                val createdAt: String? = null, // 2023-10-30 10:47:09
                @SerializedName("expires_at")
                val expiresAt: String? = null, // 2024-10-30T10:47:09.000000Z
                @SerializedName("id")
                val id: String? = null, // d190d70f3f606c1a7f9ae45a0afbd81eed7d4468ebeba41a340f5a240b52b3200038bb5e7639044a
                @SerializedName("name")
                val name: String? = null, // My App
                @SerializedName("revoked")
                val revoked: Boolean? = null, // true
                @SerializedName("scopes")
                val scopes: List<Any?>? = null,
                @SerializedName("updated_at")
                val updatedAt: String? = null, // 2023-10-30 10:47:09
                @SerializedName("user_id")
                val userId: Int? = null // 835
            )
        }
    }
}