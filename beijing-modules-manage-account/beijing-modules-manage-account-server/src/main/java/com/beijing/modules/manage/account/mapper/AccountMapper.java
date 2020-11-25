package com.beijing.modules.manage.account.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beijing.modules.manage.account.entity.Account;
import com.beijing.modules.manage.account.vo.LevelVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 护士等级表 Mapper 接口
 * </p>
 *
 * @author sx
 * @since 2020-11-19
 */
@Mapper
@Repository
public interface AccountMapper extends BaseMapper<Account> {

    /**
     * 测试map映射
     * @return
     */
    Map<String, Long> testMapVo(@Param("levelVoList") List<LevelVo> levelVoList);

//    List<String> testMapVo();
}
