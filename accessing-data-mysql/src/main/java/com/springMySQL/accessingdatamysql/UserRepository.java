package com.springMySQL.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;
import com.springMySQL.accessingdatamysql.User;


public interface UserRepository extends CrudRepository<User, Integer> {

}
