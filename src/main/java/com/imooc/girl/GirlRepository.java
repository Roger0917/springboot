package com.imooc.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Roger
 * @Date: 2018/7/24 21:08
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    public List<Girl> findByAge(Integer age);
}
