package cn.lngex.controller;

import cn.lngex.BusinessExceptions;
import cn.lngex.basic.BuyResult;
import cn.lngex.basic.Parameter;
import cn.lngex.service.IBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyController {

    @Autowired
    private IBuyService buyService;

    /**
     * 购买
     * @param parameter
     * @return
     */
    @PostMapping("/buy")
    public BuyResult buyCourse(@RequestBody Parameter parameter){
        System.out.println(parameter);
        BuyResult buyResult = new BuyResult();
        try {
            buyService.save(parameter);
        } catch (BusinessExceptions e) {
            buyResult.setMessage(e.getMessage()).setSuccess(false);
        } catch (Exception e) {
            buyResult.setMessage("购买失败").setSuccess(false);
            e.printStackTrace();
        }
        return buyResult;
    }
}
