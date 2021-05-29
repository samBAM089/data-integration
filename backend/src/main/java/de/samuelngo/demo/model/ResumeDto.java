package de.samuelngo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResumeDto {

    private String guid;
    private String link;
    private String author;
    private String category1;
    private String category2;
    private String category3;
    private String category4;
    private String category5;
    private String title;
    private String description;
    private String pubDate;
    private String updated;
    private String location;

}
