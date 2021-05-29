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

    public Resume addResume(Resume newResume){
        resumeList.add(newResume);
        return newResume;
    }
}
