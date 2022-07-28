package com.nisar.test;

import com.nisar.domain.Organization;
import com.nisar.repo.OrganizationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class AppTest {
    @Test
    void contextLoads() {
    }

    @Autowired
    private OrganizationRepository repo;

    @Test
    void insertOrganization(){
        Organization org= new Organization();
        org.setId(UUID.randomUUID().toString());
        org.setName("TEST");
        org.setContactPhone("12245677");
        org.setContactEmail("BEST@BEST.com");
        org.setContactName("BEST");

        repo.save(org);

    }
}
