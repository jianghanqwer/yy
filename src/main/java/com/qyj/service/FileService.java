package com.qyj.service;

import com.qyj.domain.File;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FileService {

    /**
     *
     * @param file
     * @return
     */
    public boolean save(File file);

    /**
     *
     * @param file
     * @return
     */
    public boolean update(File file);

    /**
     *
     * @param fileNo
     * @param state
     * @return
     */
    public boolean updateState(String fileNo,Integer state);

    /**
     *
     * @return
     */
    public String getCount();

    /**
     *
     * @return
     */
    public List<File> getAll(Integer state);

    /**
     *
     * @param id
     * @return
     */
    public File getById(Integer id);

}
