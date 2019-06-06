package com.tim.replan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tim.replan.model.PortalReplan;
import com.tim.replan.model.Processo;
import com.tim.replan.model.Regional;
import com.tim.replan.repository.PortalReplanRepository;

@Service
public class PortalReplanService {

	@Autowired
	private PortalReplanRepository repository;
	
	private List<PortalReplan> listaReplan = new ArrayList<>();
	
	@Cacheable(cacheNames = "replanRegional")
	public List<PortalReplan> getAllByRegional(Regional regional){

		if(regional.name().equalsIgnoreCase("TBR")) {
			listaReplan = repository.findAll();
			return listaReplan;
		}
		
		listaReplan = repository.findAllByRegional(regional.name());
		
		return listaReplan;
	}
	
	
	public List<PortalReplan> getAllByRegionalAndProcesso(Regional regional, Processo processo){
		
		if(Processo.AQUISICAO.equals(processo)) {
			listaReplan = repository.findAllByRegionalAndAquisicao(regional.name());
		}
		return listaReplan;
	}
}
