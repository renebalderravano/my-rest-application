package com.myapplication.repository.impl;

import org.springframework.stereotype.Repository;

import com.myapplication.model.HousingLocation;
import com.myapplication.model.Publication;
import com.myapplication.repository.HousingLocationRepository;
import com.myapplication.repository.PublicationRepository;
import com.myapplication.util.BaseRespository;


@Repository
public class PublicationRepositoryImpl extends BaseRespository<Publication> implements PublicationRepository {

}
