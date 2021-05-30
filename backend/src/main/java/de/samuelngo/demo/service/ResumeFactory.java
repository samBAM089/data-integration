package de.samuelngo.demo.service;

import de.samuelngo.demo.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResumeFactory {

    public List<Resume> createResumes(List<ResumeDto> jobList){
        List<Resume> resumes = new ArrayList<>();
        for (ResumeDto dto : jobList) {

            Location location = Location.builder().city(dto.getLocation()).build();
            Basics basics = Basics.builder().location(location).build();
            WorkItem workItem = WorkItem.builder()
                    .company(dto.getAuthor())
                    .website(dto.getLink())
                    .position(dto.getTitle())
                    .summary(dto.getDescription())
                    .startDate(dto.getPubDate())
                    .endDate(dto.getUpdated())
                    .summary(dto.getDescription())
                    .highlights(dto.getCategories())
                    .build();

            Resume newResume = Resume.builder()
                    .basics(basics)
                    .work(new Work(List.of(workItem)))
                    .build();
            resumes.add(newResume);
        }
        return resumes;
    }

}
