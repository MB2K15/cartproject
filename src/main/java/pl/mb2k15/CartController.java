package pl.mb2k15;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

@Controller
public class CartController {


    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/warehouse/addproducttocart", method = RequestMethod.POST)

    public String addToCart(@RequestParam(value = "productId") Integer productId, Model model , HttpSession session) {
        List<ProductModel> lista =(List<ProductModel>)session.getAttribute("cartproductlist");

        if(lista==null)
        {

            lista = new ArrayList<>();
            session.setAttribute("cartproductlist" , lista);

        }

 ProductModel product = productRepository.findOne(productId);
        lista.add(product);
        model.addAttribute("cartproductlist" , lista);
        return "upcart";
    }


    public float getAll(List<ProductModel> listproduct) {

        float allcostproducts = 0;

        for (ProductModel product : listproduct) {


            allcostproducts += (product.getPrice() * product.getNumber());

        }

        return allcostproducts;

    }


}
