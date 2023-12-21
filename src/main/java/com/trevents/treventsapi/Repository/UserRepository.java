package com.trevents.treventsapi.Repository;

import com.trevents.treventsapi.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserModel, Integer> {
}
