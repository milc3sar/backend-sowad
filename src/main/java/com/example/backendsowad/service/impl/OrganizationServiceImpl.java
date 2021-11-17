package com.example.backendsowad.service.impl;

import com.example.backendsowad.entity.Organization;
import com.example.backendsowad.repository.GenericDao;
import com.example.backendsowad.service.OrganizationService;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl extends GenericServiceImpl<Organization> implements OrganizationService {

    public OrganizationServiceImpl(GenericDao<Organization> dao) {
        super(dao);
    }
}
