package com.beijing.modules.manage.fengtai.service.impl;

import com.beijing.modules.manage.fengtai.commons.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;

@Slf4j
@Service
//@org.apache.dubbo.config.annotation.Service(version = "${dubbo.version}")
public class LoginServiceImpl implements LoginService {

    @Override
    public void loginTest() {
        System.out.println("=========loginTest==========");
    }

    @Override
    public Object testMapVo() {
        return null;
    }


//    public static void main(String[] args) {
////        String date = "2020-11-20 11:12:13";
////        LocalDateTime format = DateUtils.parse(date, DateUtils.DEFAULT_FORMATTER_YYYY_MM_DD);
////        System.out.println(format);
////        int month = format.getMonthValue();
////        System.out.println(month);
//
//        //声明需要格式化的格式(日期加时间)
////        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM");
////        String format = dateTimeFormatter.format(LocalDateTime.now());
////        System.out.println(format);
//        List<ExpMonthListVo> expMonthListVoList = new ArrayList();//库里查出来的集合
//        List<NurseExpPageVo> nurseExpPageVoList = new ArrayList();//返给前端的集合
//        List<ExpMonthListVo> pageVoMonthList = new ArrayList();//保存在前端集合中的经验记录集合
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM");
//        NurseExpPageVo vo = new NurseExpPageVo();
//        if (null != expMonthListVoList && expMonthListVoList.size() > 0) {
//            for (int i = 0; i < expMonthListVoList.size(); i++) {
//                expMonthListVo listVo = expMonthListVoList.get(i);
//                vo.setExpDate(dateTimeFormatter.format(listVo.getCreateTime()));
//                vo.setExpSum(vo.getExpSum() + listVo.getExp());
//                pageVoMonthList.add(listVo);
//                if (nurseExpPageVoList.size() == 1){
//                    vo.setExpMonthListVo(pageVoMonthList);
//                    break;
//                }
//                if (i != nurseExpPageVoList.size() - 1) {
//                    expMonthListVo nextListVo = expMonthListVoList.get(i + 1);
//                    if (listVo.getCreateTime().getMonthValue() != nextListVo.getCreateTime().getMonthValue()) {
//                        vo.setExpMonthListVo(pageVoMonthList);
//                        vo = new NurseExpPageVo();
//                        pageVoMonthList = new List<ExpMonthListVo>();
//                    }
//                    continue;
//                }
//                vo.setExpMonthListVo(pageVoMonthList);
//            }
//        }
//    }
}
