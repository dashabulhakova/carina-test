package com.solvd.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

@Endpoint(url = "https://dog.ceo/api/${end_point}", methodType = HttpMethodType.POST)
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class PostDogMethods extends AbstractApiMethodV2 {
    public PostDogMethods() {
        super("api/dogs/_post/rq.json", "api/dogs/_post/rs.json");
    }
}
