package de.samuelngo.demo.service;

import de.samuelngo.demo.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeFactory {

    public Resume createResume(ResumeDto dto){
      //  Location location = Location.builder().city(dto.getLocation()).build();
        Location location = new Location();
        location.setCity(dto.getLocation());

        Basics basics = Basics.builder().id(dto.getGuid()).location(location).build();
        WorkItem workItem = WorkItem.builder()
                .company(dto.getAuthor())
                .website(dto.getLink())
                .position(dto.getTitle())
                .summary(dto.getDescription())
                .startDate(dto.getPubDate())
                .endDate(dto.getUpdated())
                .highlights(List.of(
                        dto.getCategory1(),
                        dto.getCategory2(),
                        dto.getCategory3(),
                        dto.getCategory4(),
                        dto.getCategory5()))
                .build();

        Resume newResume = Resume.builder()
                .basics(basics)
                .work(new Work(List.of(workItem)))
                .build();
        return newResume;
    }
}
