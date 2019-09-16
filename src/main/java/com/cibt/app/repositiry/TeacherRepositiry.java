/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.repositiry;

import com.cibt.app.entity.TeacherDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository
public interface TeacherRepositiry extends JpaRepository<TeacherDetail, Long>{
    
 
    
}
