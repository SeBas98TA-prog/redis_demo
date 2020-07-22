package com.redis.repository;

import java.util.Map;

import com.redis.model.Student;

public interface RedisRepository {
	Map<String, Student> findAll();
    Student findById(String id);
    void save(Student student);
    void delete(String id);
}
