package com.beijing.modules.manage.account.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.beijing.modules.manage.account.entity.Account;

/**
 * <p>
 * 护士等级表 服务类
 * </p>
 *
 * @author sx
 * @since 2020-11-19
 */
public interface IAccountService extends IService<Account> {

    /**
     * 测试map映射
     * @return
     */
    Object testMapVo();
}
