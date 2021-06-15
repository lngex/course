package cn.lngex.service.impl;


import cn.lngex.BuyLog;
import cn.lngex.Course;
import cn.lngex.basic.Parameter;
import cn.lngex.feign.IFeign;
import cn.lngex.mapper.BuyMapper;
import cn.lngex.service.IBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BuyServiceImpl implements IBuyService {

    @Autowired
    private BuyMapper buyMapper;

    @Autowired
    private IFeign feign;

    /**
     * 购买书本
     * @param parameter
     */
    @Override
    @Transactional
    public void save(Parameter parameter) {
        BuyLog buyLog = this.parameterToBuyLog(parameter);
        /* 获取书本信息 */
        Course course = feign.buy(parameter.getCourseId());
        /* 设置支付金额 */
        buyLog.setPay_price(course.getPrice()*parameter.getBuy_number());
        /* 修改购买的书本 */
        course.setSale_count(parameter.getBuy_number());
        /* 保存书本信息 */
        feign.update(course);
        /* 保存日志 */
        buyMapper.save(buyLog);
    }

    /**
     * 将参数转换为对象
     * @param parameter
     * @return
     */
    public BuyLog parameterToBuyLog(Parameter parameter){
        BuyLog buyLog = new BuyLog();
        return buyLog.setUser_id(parameter.getUserId())
                .setBuy_count(parameter.getBuy_number());
    }
}
