package com.launchcode.cheesemvc.repositories;

import com.launchcode.cheesemvc.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CheeseRepository extends CrudRepository<Cheese, Integer> {
}
