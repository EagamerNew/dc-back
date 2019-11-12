package com.kz.digitalcontrol.repository;

import com.kz.digitalcontrol.model.Main;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MainRepository extends JpaRepository<Main, Integer>  {
    Main findByIdAndStateIs(int id,int state);
    List<Main> findAllByStateIs(int state);
}
