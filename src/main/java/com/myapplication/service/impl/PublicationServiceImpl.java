package com.myapplication.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myapplication.model.Publication;
import com.myapplication.service.PublicationService;
import com.myapplication.util.BaseService;

@Service
@Transactional
public class PublicationServiceImpl extends BaseService<Publication> implements PublicationService {

}
