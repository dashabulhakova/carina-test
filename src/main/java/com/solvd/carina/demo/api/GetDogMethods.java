package com.solvd.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

@Endpoint(url = "https://dog.ceo/api/${end_point}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api.dogs._get/rs_ListAll.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetDogMethods extends AbstractApiMethodV2 {
    public GetDogMethods() {
        setHeaders("format=json");
    }
}
