package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product;

@Controller
public class MainController {

	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products = this.productDao.getProducts();
		System.out.println(products);
		m.addAttribute("products", products);
		return "index";
	}

	@RequestMapping("/products")
	public String products(Model m) {
		List<Product> products = this.productDao.getProducts();
		System.out.println(products);
		m.addAttribute("products", products);
		return "home";
	}

	@RequestMapping("/add-product")
	public String addProduct() {
		return "addproduct";
	}

	@RequestMapping(path = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		this.productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/products");
		return redirectView;
	}

	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
		this.productDao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/products");
		return redirectView;
	}

	@RequestMapping("/update/{productId}")
	public String getUpdate(@PathVariable("productId") int productId, Model m) {
		Product p = this.productDao.getProduct(productId);
		m.addAttribute("product", p);
		return "updateproduct";
	}

}
