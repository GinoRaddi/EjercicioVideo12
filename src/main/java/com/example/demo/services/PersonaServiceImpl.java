package com.example.demo.services;

import com.example.demo.entities.Persona;
import com.example.demo.repositories.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {
    public PersonaServiceImpl(PersonaRepository baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Persona> findAll() throws Exception {
        return baseRepository.findAll();
    }

    @Override
    public Persona findById(Long aLong) throws Exception {
        return ((PersonaRepository) baseRepository).findById(aLong).orElse(null);
    }

    @Override
    public Persona save(Persona entity) throws Exception {
        return ((PersonaRepository)baseRepository).save(entity);
    }

    @Override
    public Persona update(Long aLong, Persona entity) throws Exception {
        Persona persona = this.findById(aLong);
        persona.setApellido(entity.getApellido());
        persona.setNombre(entity.getNombre());
        persona.setDni(entity.getDni());
        persona.setDomicilio(entity.getDomicilio());
        return ((PersonaRepository)baseRepository).save(persona);
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        if (baseRepository.existsById(aLong)){
            baseRepository.deleteById(aLong);
            return true;
        }else {
            return false;
        }
    }
}
