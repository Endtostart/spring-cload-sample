package cloud.euraka.customer.Controllers;

import cloud.euraka.customer.service.impl.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @Autowired
    private PayService payService;

    @RequestMapping(value = "pay")
    public void pay(@RequestParam("id") String id) {
        payService.pay(id);
    }

}
