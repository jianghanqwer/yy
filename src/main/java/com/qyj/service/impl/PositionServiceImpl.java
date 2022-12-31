package com.qyj.service.impl;

import com.qyj.dao.PositionDao;
import com.qyj.domain.Position;
import com.qyj.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionDao positionDao;

    @Override
    public Position getClassification() {
        return positionDao.getClassification();
    }

    @Override
    public Position getName(Integer id) {
        return positionDao.getName(id);
    }
}
