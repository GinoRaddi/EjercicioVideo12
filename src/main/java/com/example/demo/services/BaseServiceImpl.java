package com.example.demo.services;

import com.example.demo.entities.Base;
import com.example.demo.repositories.BaseRepository;

import java.io.Serializable;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository baseRepository;

    public BaseServiceImpl(BaseRepository<E,ID> baseRepository) {
        this.baseRepository = baseRepository ;
    }
}
