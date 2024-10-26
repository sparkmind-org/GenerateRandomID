package com.example.IDGeneratorDemo.service;

import com.example.IDGeneratorDemo.entity.Utility;
import com.example.IDGeneratorDemo.repository.UtilityRepository;
import com.example.IDGeneratorDemo.util.IDGenerator;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilityService {

    @Autowired
    private UtilityRepository utilityRepository;

    @Transactional
    public Utility createUtility(String name, int age) {
        String customerId = IDGenerator.generateRandomID();
        String accountId = IDGenerator.generateRandomID();
        String loanId = IDGenerator.generateRandomID();

        Utility utility = new Utility(customerId, accountId, loanId, name, age);
        return utilityRepository.save(utility);
    }
}
