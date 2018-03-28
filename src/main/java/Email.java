import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;



public class Email {

    @SerializedName("email")
    @Expose
    public String email;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("email", email).toString();
    }
}