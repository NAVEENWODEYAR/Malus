package com.bhas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhas.modal.Apple;

@Repository
public interface AppleRepo extends JpaRepository<Apple, Integer>
{

}
