package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count",required = false) String count,Model model) {
		List<String> messages = new ArrayList<>();
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(111,"Audi",2001));
		cars.add(new Car(222,"BMW",2005));
		cars.add(new Car(333,"Honda",2010));
		cars.add(new Car(444,"Jeely",2015));
		cars.add(new Car(555,"LADA",2020));


        if (count==null || Integer.parseInt(count)>=5) {
            for (Car car : cars) {
                messages.add(car.toString());
            }
            model.addAttribute("cars", messages);
        }else if(Integer.parseInt(count)>=2 && Integer.parseInt(count)<=4 ){
            for(int i = 0; i < Integer.parseInt(count); i ++){
                    messages.add(cars.get(i).toString());
                }
                model.addAttribute("cars", messages);
        }


//        if (count != null) {
//            int c = Integer.parseInt(count);
//            if(c >=5 ){
//                for (Car car : cars) {
//                    messages.add(car.toString());
//                }
//                model.addAttribute("cars", messages);
//            }else if(c>=2 && c <=4){
//                for(int i = 0; i < c; i ++){
//                    messages.add(cars.get(i).toString());
//                }
//                model.addAttribute("cars", messages);
//            }
//
//        }else{
//            for (Car car : cars) {
//                messages.add(car.toString());
//            }
//            model.addAttribute("cars", messages);
//        }


        return "cars";
    }
}
