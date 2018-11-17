package com.service.gateway.Repository;

import com.service.gateway.DataObject.ServiceMapping;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<ServiceMapping, String> {
}
