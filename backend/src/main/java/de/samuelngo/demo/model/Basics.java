package de.samuelngo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Basics {

    private String name;
    private String label;
    private String picture;
    private String email;
    private String website;
    private String summary;
    private Location location;
}
