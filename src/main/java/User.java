import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class User {

    @SerializedName("id")
    @Expose
    public Integer id;

    @SerializedName("first_name")
    @Expose
    public String first_name;

    @SerializedName("last_name")
    @Expose
    public String last_name;

    @SerializedName("avatar")
    @Expose
    public String avatar;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("first_name", first_name).append("last_name", last_name).append("avatar", avatar).toString();
    }
}
