package randomUser;

import lombok.Data;

@Data
public class Info {
    private String seed;
    private int results;
    private int page;
    private String version;
}
