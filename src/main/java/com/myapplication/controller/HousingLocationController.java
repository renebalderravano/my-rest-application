package com.myapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapplication.model.HousingLocation;
import com.myapplication.util.BaseController;

@RestController
@RequestMapping(path = "housinglocation")
public class HousingLocationController extends BaseController<HousingLocation>  {
	
}
