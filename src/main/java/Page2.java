import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;


public class Page2 {

    @SerializedName("data")
    @Expose
    public User data;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("data", data).toString();
    }
}
