package com.mapper;

/**
 * @Classname
 * @Description
 */
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.Menu;

import java.util.List;

/**
 */
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long id);
}