package com.service.gateway.DataObject;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("ServiceMapping")
@Data
public class ServiceMapping implements Serializable  {
    @Id private String serviceName;
    private String location;
}
