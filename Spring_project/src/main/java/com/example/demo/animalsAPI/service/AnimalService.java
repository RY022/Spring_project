package com.example.demo.animalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalsAPI.data.AnimalData;
import com.example.demo.animalsAPI.repository.AnimalRepository;

@Service
public class AnimalService {

	private final AnimalRepository animalRepository;

	public AnimalService(AnimalRepository animalRepository) {
		this.animalRepository = animalRepository;
	}

	public List<AnimalData> getAnimals() throws IOException {
		AnimalData[] animalList = animalRepository.getAnimals();
		return Arrays.asList(animalList);
	}

	public List<AnimalData> getAnimaldDetail(int id) throws IOException {
		AnimalData[] animalDetail = animalRepository.getAnimalDetail(id);
		return Arrays.asList(animalDetail);
	}
}