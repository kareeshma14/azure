package com.example.device.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.device.entity.e_Devices;
import com.example.device.repository.e_DevicesRepository;

@Service
public class e_DevicesService {
	@Autowired
    private e_DevicesRepository repository;


    public e_Devices addDevices(e_Devices Devices) {
        return repository.save(Devices);
    }

    public List<e_Devices> getAllDevices() {
        return repository.findAll();
    }
}
