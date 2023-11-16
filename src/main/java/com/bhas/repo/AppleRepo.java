package com.bhas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhas.modal.Apple;

public interface AppleRepo extends JpaRepository<Apple, Integer>
{

}
