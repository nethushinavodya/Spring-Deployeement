package org.example.springdeployeement.repo;

import org.example.springdeployeement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
    @Modifying
    @Query("update Customer c set c.name = ?1, c.email = ?2, c.address = ?3 where c.id = ?4")
    void update(String name, String email, String address, Long id);
}
