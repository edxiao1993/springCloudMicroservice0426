package org.kevin.service.impl;

import org.apache.ibatis.session.RowBounds;
import org.kevin.common.CommonUtils;
import org.kevin.common.Constant;
import org.kevin.mapper.SecretMomentMapper;
import org.kevin.model.SecretMoment;
import org.kevin.model.SecretMomentExample;
import org.kevin.service.SecretMomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kevin.Z
 * @version 2021/3/29
 */
@Service
public class SecretMomentServiceImpl implements SecretMomentService {
    @Autowired
    private SecretMomentMapper secretMomentMapper;

    @Override
    public int insert(SecretMoment record) {
        return secretMomentMapper.insert(record);
    }

    @Override
    public int insertNewRecord(String content) {
        SecretMoment record = new SecretMoment();
        record.setMoment(CommonUtils.replaceLineCharacter(content));
        return this.insert(record);
    }

    @Override
    public List<SecretMoment> findList(SecretMomentExample example) {
        return secretMomentMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<SecretMoment> findList() {
        return this.findList(Integer.MAX_VALUE);
    }

    @Override
    public List<SecretMoment> findList(String moment) {
        return this.findList(moment, 0, Constant.DEFAULT_PAGE_SIZE);
    }

    @Override
    public List<SecretMoment> findList(Integer limit) {
        return this.findList(null, 0, limit);
    }

    @Override
    public List<SecretMoment> findList(String moment, Integer page, Integer limit) {
        SecretMomentExample example = new SecretMomentExample();
        example.setOrderByClause("create_time DESC");
        // moment = null;
        page = page == null ? 0 : page;
        limit = limit == null ? Constant.DEFAULT_PAGE_SIZE : limit;
        RowBounds rb = new RowBounds(page * limit, limit);
        return secretMomentMapper.selectByExampleWithBLOBsWithRowbounds(example, rb);
    }

    @Override
    public Long count(String moment) {
        SecretMomentExample example = new SecretMomentExample();
        example.setOrderByClause("create_time DESC");
        return secretMomentMapper.countByExample(example);
    }
}
