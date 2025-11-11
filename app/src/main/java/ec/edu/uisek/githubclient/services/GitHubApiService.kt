package ec.edu.uisek.githubclient.services

import ec.edu.uisek.githubclient.models.Repo
import okhttp3.Call
import retrofit2.http.GET

interface GitHubApiService {
    @GET("/user/repos")
    fun getRepos(): Call<List<Repo>>

}