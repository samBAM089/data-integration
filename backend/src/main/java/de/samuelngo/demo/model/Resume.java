package de.samuelngo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Resume {
    private Basics basics;
    private Work work;
    private Volunteer volunteer;
    private Education education;
    private Awards awards;
    private Publications publications;
    private Skills skills;
    private Languages languages;
    private Interests interests;
    private References references;
}
