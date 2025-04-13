package com.myapplication.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapplication.model.HousingLocation;
import com.myapplication.model.Publication;
import com.myapplication.util.BaseController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "publication")
public class PublicationController extends BaseController<Publication>  {
	
}
