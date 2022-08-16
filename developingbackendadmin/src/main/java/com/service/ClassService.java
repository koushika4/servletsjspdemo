package com.service;
import java.util.List;
import com.bean.Classes;
import com.bean.Trainer;
import com.dao.ClassDao;
import com.dao.TrainerDao;
public class ClassService {
ClassDao cd = new ClassDao();
    public String storeClass(Classes classes) {
        if(cd.storeClass(classes)>0) {
            return "Class details stored successfully";
        }else {
            return "Class details didn't store";
        }
    }
    
    public List<Classes> getAllClasses() {
        return cd.findAllClasses();
    }
}
