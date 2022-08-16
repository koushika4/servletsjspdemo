
package com.service;
import java.util.List;
import com.bean.Subject;
import com.dao.SubjectDao;
public class SubjectService {
SubjectDao sbd = new SubjectDao();
    public String storeSubject(Subject subject) {
        if(sbd.storeSubject(subject)>0) {
            return "Subject details stored successfully";
        }else {
            return "Subject details didn't store";
        }
    }
    
    public List<Subject> getAllSubjects() {
        return sbd.findAllSubjects();
    }
}
