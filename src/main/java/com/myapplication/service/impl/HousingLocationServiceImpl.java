package com.myapplication.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapplication.model.HousingLocation;
import com.myapplication.service.HousingLocationService;
import com.myapplication.util.BaseService;

@Service
@Transactional
public class HousingLocationServiceImpl extends BaseService<HousingLocation> implements HousingLocationService {

}
