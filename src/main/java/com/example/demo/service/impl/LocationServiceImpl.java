package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepository;
import com.example.demo.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository lrp;

    @Override
    public Location createLocation(Location location) {
        return location;
    }

    @Override
    public List<Location> getAllLocations() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllLocations'");
    }
    
}
