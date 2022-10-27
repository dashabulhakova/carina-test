package com.solvd.carina.demo;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.solvd.carina.demo.api.GetDogMethods;
import com.solvd.carina.demo.api.GetUserMethods;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class APITest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    public void testGetAllDogs() {
        GetDogMethods getJokeMethods = new GetDogMethods();
        getJokeMethods.replaceUrlPlaceholder("end_point", "breeds/list/all");
        getJokeMethods.callAPIExpectSuccess();
        getJokeMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getJokeMethods.validateResponseAgainstSchema("api/dogs._get/rs_ListAll.schema");
    }

}
