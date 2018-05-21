package com.blues.middle;

import com.blues.common.DatabaseApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value= "db", configuration = OAuth2FeignAutoConfiguration.class)
public interface DatabaseApiService extends DatabaseApi {
}
