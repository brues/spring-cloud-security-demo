package com.blues.main;

import com.blues.security.common.MiddleApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value= "middle")
public interface MiddleApiService extends MiddleApi {
}
