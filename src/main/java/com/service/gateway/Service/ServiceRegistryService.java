package com.service.gateway.Service;


import com.service.gateway.DataObject.ServiceMapping;
import com.service.gateway.Repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRegistryService {

    @Autowired
    ServiceRepository serviceRepository;

    public String setMappingDetails(ServiceMapping serviceMapping) {
        try {
            serviceRepository.save(serviceMapping);
            return "registry successful";
        } catch (Exception e) {
            return "unable to register at this time";
        }
    }
}
