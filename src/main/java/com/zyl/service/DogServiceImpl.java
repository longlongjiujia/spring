package com.zyl.service;

/**
 * package com.zyl.service
 * User: zhangyanlong
 * Email: zhangyanlong@jd.com
 * Date: 2020/6/2
 * Time: 上午11:30
 * Description:
 */
public class DogServiceImpl {


    private PetStoreServiceImpl petStoreService;


    public PetStoreServiceImpl getPetStoreService() {
        return petStoreService;
    }

    public void setPetStoreService(PetStoreServiceImpl petStoreService) {
        this.petStoreService = petStoreService;
    }
}