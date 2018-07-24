package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Roger
 * @Date: 2018/7/24 21:39
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girl1= new Girl();
        girl1.setAge(18);
        girl1.setCupSize("A");
        girlRepository.save(girl1);

        Girl girl2= new Girl();
        girl1.setAge(20);
        girl1.setCupSize("F");
        girlRepository.save(girl2);

    }
}
