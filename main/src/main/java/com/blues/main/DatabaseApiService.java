package com.blues.main;

import com.blues.common.DatabaseApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value= "db", configuration = OAuth2FeignAutoConfiguration.class)
public interface DatabaseApiService extends DatabaseApi {
}
