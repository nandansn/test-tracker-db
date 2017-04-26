/**
 * 
 */
package com.nanda.testtracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nanda.testtracker.dal.model.TestCase;

/**
 * @author Nandakumar 
 * 23-Apr-2017
 *
 */
public interface TestCaseRepository extends CrudRepository<TestCase,String>{
    
    @Query("select tc from TestCase tc where tc.id = ?1")
    List<TestCase> findAllTestCasesByVersion(String version);

}
