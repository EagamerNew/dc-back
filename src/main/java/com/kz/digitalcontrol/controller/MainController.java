package com.kz.digitalcontrol.controller;

import com.kz.digitalcontrol.model.Main;
import com.kz.digitalcontrol.repository.MainRepository;
import com.kz.digitalcontrol.service.IMainService;
import com.kz.digitalcontrol.utils.CommonService;
import com.kz.digitalcontrol.utils.error.InternalException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController extends CommonService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private IMainService mainService;

    @RequestMapping("/read/iterable")
    public ResponseEntity<?> readMainIterable(){
        try {
            return builder(success(mainService.readMainIterable()));
        } catch (InternalException e) {
            LOGGER.error(e.getMessage(), e);
            return builder(errorWithDescription(e.getErrorRef(), e.getMessage()));
        }

    }
}
