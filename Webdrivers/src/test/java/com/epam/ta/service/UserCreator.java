package com.epam.ta.service;

import com.epam.ta.model.User;

public class UserCreator {

    public static final String TESTDATA_NUMBER_OF_INSTANCES = "testdata.number.of.instances";
    public static final String TESTDATA_INSTANCE_TYPE = "testdata.instance.type";
    public static final String TESTDATA_NUMBER_OF_GPUS = "testdata.number.of.gpus";
    public static final String TESTDATA_GPU_TYPE = "testdata.gpu.type";
    public static final String TESTDATA_LOCAL_SSD = "testdata.local.ssd";
    public static final String TESTDATA_DATACENTER_LOCATION = "testdata.datacenter.location";
    public static final String TESTDATA_COMMITED_USAGE= "testdata.commited.usage";
    public static final String TESTDATA_RESULT_NUMBER_OF_INSTANCES = "testdata.result.number.of.instances";
    public static final String TESTDATA_RESULT_INSTANCE_TYPE = "testdata.result.instance.type";
    public static final String TESTDATA_RESULT_TOTAL_HOURS = "testdata.result.total.hours";
    public static final String TESTDATA_RESULT_COST = "testdata.result.cost";


    public static User withCredentialsFromProperty(){
        return new User(TestDataReader.getTestData(TESTDATA_NUMBER_OF_INSTANCES),
                TestDataReader.getTestData(TESTDATA_INSTANCE_TYPE),
                TestDataReader.getTestData(TESTDATA_NUMBER_OF_GPUS),
                TestDataReader.getTestData(TESTDATA_GPU_TYPE),
                TestDataReader.getTestData(TESTDATA_LOCAL_SSD),
                TestDataReader.getTestData(TESTDATA_DATACENTER_LOCATION),
                TestDataReader.getTestData(TESTDATA_COMMITED_USAGE),
                TestDataReader.getTestData(TESTDATA_RESULT_NUMBER_OF_INSTANCES),
                TestDataReader.getTestData(TESTDATA_RESULT_INSTANCE_TYPE),
                TestDataReader.getTestData(TESTDATA_RESULT_TOTAL_HOURS),
                TestDataReader.getTestData(TESTDATA_RESULT_COST)
                );
    }

}