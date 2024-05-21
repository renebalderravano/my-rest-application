package com.myapplication.repository.impl;

import org.springframework.stereotype.Repository;

import com.myapplication.model.HousingLocation;
import com.myapplication.repository.HousingLocationRepository;
import com.myapplication.util.BaseRespository;


@Repository
public class HousingLocationRepositoryImpl extends BaseRespository<HousingLocation> implements HousingLocationRepository {

}
