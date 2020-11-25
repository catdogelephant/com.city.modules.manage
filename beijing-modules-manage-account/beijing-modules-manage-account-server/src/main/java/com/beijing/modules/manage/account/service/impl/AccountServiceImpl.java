package com.beijing.modules.manage.account.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.beijing.modules.manage.account.entity.Account;
import com.beijing.modules.manage.account.mapper.AccountMapper;
import com.beijing.modules.manage.account.service.IAccountService;
import com.beijing.modules.manage.account.vo.LevelVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * 护士等级表 服务实现类
 * </p>
 *
 * @author sx
 * @since 2020-11-19
 */
@Slf4j
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;

    /**
     * 测试map映射
     * @return
     */
    @Override
    public Object testMapVo() {
        List<LevelVo> levelVoList = new ArrayList<LevelVo>();
        LevelVo levelVoOne = new LevelVo();
        levelVoOne.setLevel("1");
        levelVoOne.setStartExp(0);
        levelVoOne.setTopExp(10);
        LevelVo levelVoTwo = new LevelVo();
        levelVoTwo.setLevel("2");
        levelVoTwo.setStartExp(11);
        levelVoTwo.setTopExp(20);
        LevelVo levelVoThree = new LevelVo();
        levelVoThree.setLevel("3");
        levelVoThree.setStartExp(21);
        levelVoThree.setTopExp(30);
        levelVoList.add(levelVoOne);
        levelVoList.add(levelVoTwo);
        levelVoList.add(levelVoThree);
        Map<String, Long> map = accountMapper.testMapVo(levelVoList);
        Set<String> keySet = map.keySet();
        for (String level : keySet) {
            for (LevelVo levelVo : levelVoList) {
                if (level.equals(levelVo.getLevel())){
                    levelVo.setCount(map.get(level));
                }
            }
        }
        return levelVoList;
//        return accountMapper.testMapVo();
    }
}
