package com.blues.middle;

import com.blues.security.common.DatabaseApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value= "database")
public interface DatabaseApiService extends DatabaseApi {
}
