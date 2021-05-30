package de.samuelngo.demo.controller;


import de.samuelngo.demo.model.Resume;
import de.samuelngo.demo.model.ResumeDto;
import de.samuelngo.demo.service.ResumeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/resume")
public class ResumeController {

    private final ResumeService resumeService;

    @Autowired
    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping
    public List<Resume> addNewResumes(@RequestBody List<ResumeDto> jobList){
        return resumeService.addResumes(jobList);
    }

    @GetMapping
    public List<Resume> getAllResumes(){
        return resumeService.listAllResume();
    }



}
