package com.example.backendsowad.service.impl;

import com.example.backendsowad.entity.Advertisement;
import com.example.backendsowad.repository.GenericDao;
import com.example.backendsowad.repository.AdvertisementRepository;
import com.example.backendsowad.service.AdvertisementService;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementServiceImpl extends GenericServiceImpl<Advertisement> implements AdvertisementService {

    private AdvertisementRepository advRepository;

    public AdvertisementServiceImpl(GenericDao<Advertisement> dao) {
        super(dao);
    }
}
