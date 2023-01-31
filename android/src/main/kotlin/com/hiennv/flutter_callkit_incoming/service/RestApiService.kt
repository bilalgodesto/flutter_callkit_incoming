package com.hiennv.flutter_callkit_incoming.service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.widget.Toast
import retrofit2.Retrofit

class RestApiService {
    fun addUser(userData: UserInfo, onResult: (UserInfo?) -> Unit){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
        retrofit.addUser(userData).enqueue(
            object : Callback<UserInfo> {
                override fun onFailure(call: Call<UserInfo>, t: Throwable) {
                    
                }
                override fun onResponse( call: Call<UserInfo>, response: Response<UserInfo>) {
                    val addedUser = response.body()
                    
                }
            }
        )
    }
}