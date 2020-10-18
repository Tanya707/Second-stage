package com.epam.ta.service;

import com.epam.ta.model.Data;

public class DataCreator {

    public static final String TESTDATA_NUMBER_OF_INSTANCES = "testdata.number.of.instances";
    public static final String TESTDATA_INSTANCE_TYPE = "testdata.instance.type";
    public static final String TESTDATA_DATACENTER_LOCATION = "testdata.datacenter.location";
    public static final String TESTDATA_COMMITED_USAGE= "testdata.commited.usage";
    public static final String TESTDATA_RESULT_NUMBER_OF_INSTANCES = "testdata.result.number.of.instances";
    public static final String TESTDATA_RESULT_INSTANCE_TYPE = "testdata.result.instance.type";
    public static final String TESTDATA_RESULT_TOTAL_HOURS = "testdata.result.total.hours";
    public static final String TESTDATA_RESULT_COST = "testdata.result.cost";


    public static Data withCredentialsFromProperty(){
        return new Data(TestDataReader.getTestData(TESTDATA_NUMBER_OF_INSTANCES),
                TestDataReader.getTestData(TESTDATA_INSTANCE_TYPE),
                TestDataReader.getTestData(TESTDATA_DATACENTER_LOCATION),
                TestDataReader.getTestData(TESTDATA_COMMITED_USAGE),
                TestDataReader.getTestData(TESTDATA_RESULT_NUMBER_OF_INSTANCES),
                TestDataReader.getTestData(TESTDATA_RESULT_INSTANCE_TYPE),
                TestDataReader.getTestData(TESTDATA_RESULT_TOTAL_HOURS),
                TestDataReader.getTestData(TESTDATA_RESULT_COST)
                );
    }

}
