package com.nisar.service;

import com.nisar.domain.Organization;
import com.nisar.repo.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.UUID;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository orgRepository;

    @Autowired
    private EntityManager em;

    public Organization getOrg(String organizationId) {
        System.out.println(em.getProperties());
        return orgRepository.findById(organizationId).orElseGet(() -> new Organization());
    }

    public void saveOrg(Organization org){
        org.setId( UUID.randomUUID().toString());
        orgRepository.save(org);

    }

    public void updateOrg(Organization org){
        orgRepository.save(org);
    }

    public void deleteOrg(Organization org){
        orgRepository.delete(org);
    }
}