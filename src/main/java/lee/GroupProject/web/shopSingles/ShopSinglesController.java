package lee.GroupProject.web.shopSingles;

import lee.GroupProject.domain.product.entity.Product;
import lee.GroupProject.domain.product.service.ProductServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * 메인 컨트롤러
 */
@Slf4j
@Controller
public class ShopSinglesController {
	@Autowired
	private ProductServiceImpl service;
	@GetMapping("/shopSingles.do")
	public String main(@RequestParam("ProductNum") String ProductNum, Model model){
		Product product = new Product();
		model.addAttribute("product",product);

		Product findProduct = service.findByProductNum(ProductNum);
		model.addAttribute("findProduct",findProduct);
		return "includes/shop-single";
	}


}
