package com.blues.main;

import com.blues.common.MiddleApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value= "middle", configuration = OAuth2FeignAutoConfiguration.class)
public interface MiddleApiService extends MiddleApi {
}
