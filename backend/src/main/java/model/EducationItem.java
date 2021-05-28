package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EducationItem {
    private String institution;
    private String area;
    private String studyType;
    private String startDate;
    private String endDate;
    private String gpa;
    private List<String> courses;

}
