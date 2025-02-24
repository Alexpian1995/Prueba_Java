package com.mycompany.prueba.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public Long countById(Integer id);
}
