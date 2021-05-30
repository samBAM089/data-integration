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
public class ResumeDto {

    private String link;
    private String author;
    private List<String> categories;
    private String title;
    private String description;
    private String pubDate;
    private String updated;
    private String location;

}
