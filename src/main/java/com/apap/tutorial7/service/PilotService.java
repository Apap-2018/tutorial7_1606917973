package com.apap.tutorial7.service;

import java.util.Optional;

import com.apap.tutorial7.model.PilotModel;

/**
 * PilotService
 */
public interface PilotService {
    Optional<PilotModel> getPilotDetailByLicenseNumber(String licenseNumber);

    PilotModel addPilot(PilotModel pilot);

    void deletePilotByLicenseNumber(String licenseNumber);

    PilotModel getPilotDetailById(long id);
    
    PilotModel deletePilot(long id);
    
	PilotModel updatePilot(long id, String name, int flyHour);
}