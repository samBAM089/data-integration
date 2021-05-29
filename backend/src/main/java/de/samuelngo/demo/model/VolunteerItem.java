package de.samuelngo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class VolunteerItem {

    private String organization;
    private String position;
    private String website;
    private String startDate;
    private String endDate;
    private String summary;
    private List<String> highlight;


}
