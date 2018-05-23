package com.blues.main;

import com.blues.security.common.DatabaseApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value= "database")
public interface DatabaseApiService extends DatabaseApi {
}
