package vn.com.leaseLink.dao;

import vn.com.leaseLink.entity.Doctor;

import java.util.List;
import java.util.Map;

public interface DoctorDAO {

    Doctor findDoctorById(String id);

    boolean addDoctor(Doctor doctor);

    Map<String, Long> getNoOfDoctorsBySpeciality(String deptName);

    List<Doctor> listDoctorsBySpeciality(String keyword);

    boolean updateDiagnosis(String patientId, String doctorId, String newDiagnosis);

}
