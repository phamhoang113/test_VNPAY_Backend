package com.vnpay.test.repository;

import com.vnpay.test.model.user.Role;
import com.vnpay.test.model.user.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(RoleEnum name);

}
