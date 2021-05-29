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
public class WorkItem {
    private String company;
    private String position;
    private String website;
    private String startDate;
    private String endDate;
    private String summary;
    private List<String> highlights;
}
