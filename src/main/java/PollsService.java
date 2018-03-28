/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 *
 * @author sibikova
 */
public interface PollsService {
  @GET("/api/users?page=2")
  Call<Page> listUsers();

  @GET("/api/users/{id}")
  Call<Page2> listUser(@Path("id") int groupId);

  @GET("/api/unknown")
  Call<Page3> listRESOURCES();

  @GET("/api/unknown/{id}")
  Call<Page4> resource(@Path("id") int groupId);

  @POST("/api/users")
  Call<UserPostDostanem> postUser(@Body UserPost userrPost);

  @PUT("/api/users/2")
  Call<ResponseUpdate> putUser(@Body UserPost userkPost);

  @DELETE("/api/users/2")
  Call<ResponseUpdate> deleteUser();

  @POST("/api/register")
  Call<Token> registerUser(@Body EmPass em);

  @POST("/api/register")
  Call<Error> registerUserF(@Body Email ema);
}
