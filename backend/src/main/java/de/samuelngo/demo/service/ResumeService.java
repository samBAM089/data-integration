package de.samuelngo.demo.service;

import de.samuelngo.demo.db.ResumeDb;
import de.samuelngo.demo.model.Resume;
import de.samuelngo.demo.model.ResumeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {

    private final ResumeDb resumeDb;
    private final ResumeFactory resumeFactory;

    @Autowired
    public ResumeService(ResumeDb resumeDb, ResumeFactory resumeFactory) {

        this.resumeDb = resumeDb;
        this.resumeFactory = resumeFactory;
    }

    public List<Resume> addResumes(List<ResumeDto> jobList){
        List<Resume> resumeList = resumeFactory.createResumes(jobList);
        resumeDb.addResumes(resumeList);
        return resumeList;
    }

    public List<Resume> listAllResume(){
        return resumeDb.listAllResumes();
    }
}
