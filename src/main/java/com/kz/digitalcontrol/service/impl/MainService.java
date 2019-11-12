package com.kz.digitalcontrol.service.impl;

import com.kz.digitalcontrol.constant.DefaultConstants;
import com.kz.digitalcontrol.model.Main;
import com.kz.digitalcontrol.repository.MainRepository;
import com.kz.digitalcontrol.service.IMainService;
import com.kz.digitalcontrol.utils.error.ErrorCode;
import com.kz.digitalcontrol.utils.error.InternalException;
import com.kz.digitalcontrol.utils.error.InternalExceptionHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MainService implements IMainService {


    private static final Logger LOGGER = LoggerFactory.getLogger(MainService.class);
    private final InternalExceptionHelper IE_HELPER = new InternalExceptionHelper(this.toString());


    @Autowired
    private MainRepository mainRepository;

    @Override
    public List<Main> readMainIterable() throws InternalException {
        try {
            LOGGER.info("________READ-ITERABLE_________");
            return mainRepository.findAllByStateIs(DefaultConstants.STATE_ACTIVE);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw IE_HELPER.generate(ErrorCode.ErrorCodes.SYSTEM_ERROR, "Exception:readMainIterable", e);
        }
    }

    @Override
    public Main readOneById(int id) throws InternalException {
        try {
            return mainRepository.findByIdAndStateIs(id, DefaultConstants.STATE_ACTIVE);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw IE_HELPER.generate(ErrorCode.ErrorCodes.SYSTEM_ERROR, "Exception:readOneById", e);
        }
    }

    @Override
    public Main createMain(Main main) throws InternalException {
        try {
            main.setState(DefaultConstants.STATE_ACTIVE);
            return mainRepository.save(main);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw IE_HELPER.generate(ErrorCode.ErrorCodes.SYSTEM_ERROR, "Exception:createMain", e);
        }
    }

    @Override
    public Main updateMain(Main main) throws InternalException {
        try {
            Main oldMain = this.mainRepository.findByIdAndStateIs(main.getId(), DefaultConstants.STATE_ACTIVE);
            if(oldMain == null){
                throw new Exception("Main does not found with id:"+main.getId());
            }
            oldMain = main;
            return mainRepository.save(oldMain);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw IE_HELPER.generate(ErrorCode.ErrorCodes.SYSTEM_ERROR, "Exception:updateMain", e);
        }
    }

    @Override
    public void removeMain(int id) throws InternalException {
        try {
            Main oldMain = this.mainRepository.findByIdAndStateIs(id, DefaultConstants.STATE_ACTIVE);
            if(oldMain == null){
                throw new Exception("Main does not found with id:"+id);
            }
            oldMain.setState(DefaultConstants.STATE_DISABLE);
            mainRepository.save(oldMain);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw IE_HELPER.generate(ErrorCode.ErrorCodes.SYSTEM_ERROR, "Exception:removeMain", e);
        }
    }
}
