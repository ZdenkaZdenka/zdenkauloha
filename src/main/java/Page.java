import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class Page {

    @SerializedName("page")
    @Expose
    public Integer page;

    @SerializedName("per_page")
    @Expose
    public Integer per_page;

    @SerializedName("total")
    @Expose
    public Integer total;

    @SerializedName("total_pages")
    @Expose
    public Integer total_pages;

    @SerializedName("data")
    @Expose
    public List<User> data = null;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("page", page).append("per_page", per_page).append("total", total).append("total_pages", total_pages).append("data", data).toString();
    }
}
