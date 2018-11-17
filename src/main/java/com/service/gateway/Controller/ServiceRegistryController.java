package com.service.gateway.Controller;


import com.service.gateway.DataObject.ServiceMapping;
import com.service.gateway.Service.ServiceRegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceRegistryController {

    @Autowired
    public ServiceRegistryService serviceRegistryService;

    @PostMapping("/register")
    public String setMapping(@RequestBody ServiceMapping serviceMapping) {
        return serviceRegistryService.setMappingDetails(serviceMapping);
    }
}
