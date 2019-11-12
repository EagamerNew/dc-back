package com.kz.digitalcontrol.service;

import com.kz.digitalcontrol.model.Main;
import com.kz.digitalcontrol.utils.error.InternalException;

import java.util.List;

public interface IMainService {
    List<Main> readMainIterable() throws InternalException;
    Main readOneById(int id) throws InternalException;
    Main createMain(Main main) throws InternalException;
    Main updateMain(Main main) throws InternalException;
    void removeMain(int id) throws InternalException;
}
