package org.example.guessthenumber.services;

import org.springframework.stereotype.Service;
import org.example.guessthenumber.models.Dummy;

import java.util.List;

@Service
public interface DummyService {

    Dummy getDummy(Long id);

    List<Dummy> getDummyList();

    Dummy createDummy(Dummy dummy);
    Dummy updateDummy(Dummy dummy);
    void deleteDummy(Dummy dummy);
}
