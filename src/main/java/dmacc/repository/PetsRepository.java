package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Pets;

public interface PetsRepository extends JpaRepository<Pets, Long> {

}
