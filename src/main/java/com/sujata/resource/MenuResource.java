package com.sujata.resource;

import com.sujata.bean.Coffee;
import com.sujata.bean.Orders;
import com.sujata.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class MenuResource {
    @Autowired
    private OrderService orderService;
    @Autowired
    private CoffeeService coffeeService;
    @Autowired
    private SizeService sizeService;
    @Autowired
    private AddonService addonService;
    @Autowired
    private DiscountService discountService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/")
    public ModelAndView mainPage(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index.jsp");
        return mv;
    }
    @RequestMapping("/menu")
    public ModelAndView menu(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("coffeemenu",coffeeService.getAllCoffee());
        mv.addObject("addonmenu",addonService.getAllAddons());
        mv.addObject("sizemenu",sizeService.getAllSize());
        mv.addObject("discountmenu",discountService.getAllDiscount());
        mv.addObject("command",new Orders());
        mv.setViewName("menu.jsp");
        return mv;
    }
    @RequestMapping("/order")
    public ModelAndView placeOrder(@ModelAttribute("order") Orders order){
        ModelAndView mv = new ModelAndView();
        mv.addObject("Bill",orderService.calculateBill(order));
        mv.addObject("CofeePrice",coffeeService.getCoffeeBill(order.getCoffee_id()));
        mv.addObject("AddonPrice",addonService.getAddonBill(order.getAddon_id()));
        mv.addObject("SizePrice",sizeService.getSizeBill(order.getSize_id()));
        mv.addObject("DiscountPrice",discountService.getDiscountBill(order.getDiscount_id()));
        //orderService.placeOrders(order);
        mv.setViewName("order.jsp");
        return mv;
    }

}
