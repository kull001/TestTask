package randomUser;

import lombok.Data;

@Data
public class Picture {
    private String large;
    private String medium;
    private String thumbnail;

    public String getLarge() {
        return large;
    }

}
