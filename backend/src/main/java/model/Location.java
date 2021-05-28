package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Location {
    private String address;
    private String postalCode;
    private String city;
    private String countryCode;
    private String region;
}
