import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;


public class UserPost {

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("job")
    @Expose
    public String job;


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("job", job).toString();
    }
}
