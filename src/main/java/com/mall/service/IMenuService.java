package com.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.entity.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 青哥哥
 * @since 2022-02-10
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> findMenus(String name);
}
