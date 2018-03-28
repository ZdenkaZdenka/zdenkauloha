
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author sibikova
 */
public class PollsDemo {
    public static void main(String[] args){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PollsService polls=retrofit.create(PollsService.class);

        try {
            Response<Page> execute = polls.listUsers().execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Response<Page2> execute = polls.listUser(2).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Response<Page2> execute = polls.listUser(23).execute();
            if(execute.code()==404){
                Logger.getGlobal().log(Level.INFO,"prazdny");
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Response<Page3> execute = polls.listRESOURCES().execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Response<Page4> execute = polls.resource(2).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Response<Page4> execute = polls.resource(23).execute();
            if(execute.code()==404){
                Logger.getGlobal().log(Level.INFO,"ziaden resource");
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        UserPost user=new UserPost();
        user.name="morpheus";
        user.job="leader";


        try {
            Response<UserPostDostanem> execute = polls.postUser(user).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }


        UserPost userIny=new UserPost();
        userIny.name="morpheus";
        userIny.job="zion resident";
        try {
            Response<ResponseUpdate> execute = polls.putUser(userIny).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Response<ResponseUpdate> execute = polls.deleteUser().execute();
            if(execute.code()==204){
                Logger.getGlobal().log(Level.INFO,"uspesne vymazanie ");
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        EmPass e=new EmPass();
        e.email="sydney@fife";
        e.password="pistol";
        try {
            Response<Token> execute = polls.registerUser(e).execute();
            if(execute.code()==201){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

/*Vrati null pointer exception
        Email emailf=new Email();
        emailf.email="sydney@fife";
        try {
            Response<Error> execute = polls.registerUserF(emailf).execute();
            if(execute.code()==400){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }*/


    }
}
