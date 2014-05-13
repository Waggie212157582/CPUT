/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Waggie212157582.schoolWeb.repository;

import com.Waggie212157582.schoolWeb.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author WAGGIE
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
