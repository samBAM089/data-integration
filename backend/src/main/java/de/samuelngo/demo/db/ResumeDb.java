package de.samuelngo.demo.db;

import de.samuelngo.demo.model.Resume;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ResumeDb {

    private final List<Resume> resumeList;

    public ResumeDb() {
        this.resumeList = new ArrayList<>();
    }

    public List<Resume> listAllResumes(){
        return resumeList;
    }

    public List<Resume> addResumes(List<Resume> newResumes){
        for (Resume newResume : newResumes) {
            resumeList.add(newResume);
        }
        return resumeList;
    }
}
