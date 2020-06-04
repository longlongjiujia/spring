package com.zyl.service;

/**
 * package com.zyl.service
 * User: zhangyanlong
 * Email: zhangyanlong@jd.com
 * Date: 2020/1/13
 * Time: 17:14
 * Description:
 */
public class PetStoreServiceImpl {


    private DogServiceImpl dogService;


    public PetStoreServiceImpl() {
        System.out.println("==========");
    }


    public DogServiceImpl getDogService() {
        return dogService;
    }

    public void setDogService(DogServiceImpl dogService) {
        this.dogService = dogService;
    }
}
