package randomUser;

import lombok.Data;

@Data
public class Location {
    private Street street;
    private String city;
    private String state;
    private String country;
    private int postcode;
    private randomUser.Coordinates coordinates;
    private Timezone timezone;

}
