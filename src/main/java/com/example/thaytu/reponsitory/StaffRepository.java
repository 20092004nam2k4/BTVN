package com.example.thaytu.reponsitory;

import com.example.thaytu.Model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffRepository extends JpaRepository<Staff,Long> {
    List<Staff> findAllByNameContains(String msg);
    List<Staff> findAllByAllStaff(String name, int age,String email,String image);
    void updateStaff(Long id, Staff updatedStaff);
    void DeleteStaff(Long id, Staff deleteStaff);
    void saveStaff(Staff employee);
}
