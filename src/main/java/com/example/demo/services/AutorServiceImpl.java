package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Autor> findAll() throws Exception {
        return null;
    }

    @Override
    public Autor findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Autor save(Autor entity) throws Exception {
        return null;
    }

    @Override
    public Autor update(Long aLong, Autor entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
