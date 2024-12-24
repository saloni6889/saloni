package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dao.ProductDao;
import Model.Product;
import java.util.List;

@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ProductController() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && action.equalsIgnoreCase("add product")) {
            Product p = new Product();
            p.setName(request.getParameter("name"));
            p.setCategory(request.getParameter("category"));
            p.setModel(request.getParameter("model"));
            p.setPrice(Double.parseDouble(request.getParameter("price")));
            p.setDescription(request.getParameter("description"));
            ProductDao.addProduct(p);
//            request.setAttribute("pid", );
            request.setAttribute("msg", "Product added successfully!");
            request.getRequestDispatcher("AddProduct.jsp").forward(request, response);
        } 
        else if (action != null && action.equalsIgnoreCase("update product")) {
            Product p = new Product();
            p.setId(Integer.parseInt(request.getParameter("productId")));
            p.setName(request.getParameter("productName"));
            p.setCategory(request.getParameter("productCategory"));
            p.setModel(request.getParameter("productModel"));
            p.setPrice(Double.parseDouble(request.getParameter("productPrice")));
            p.setDescription(request.getParameter("productDescription"));
            System.out.println(p);
            ProductDao.updateProduct(p);
            request.setAttribute("msg", "Product updated successfully!");
            request.getRequestDispatcher("Edit-Product.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && action.equalsIgnoreCase("view product")) {
            List<Product> productList = ProductDao.getAllProducts();
            request.setAttribute("productList", productList);
            request.getRequestDispatcher("ViewProduct.jsp").forward(request, response);
        } 
        else if (action != null && action.equalsIgnoreCase("edit product")) {
            int productId = Integer.parseInt(request.getParameter("pid"));
            Product p = ProductDao.getProductById(productId);
            request.setAttribute("product", p);
            request.getRequestDispatcher("Edit-Product.jsp").forward(request, response);
        }
        else if (action != null && action.equalsIgnoreCase("delete")) {
            int productId = Integer.parseInt(request.getParameter("pid"));
            ProductDao.deleteProduct(productId);
            request.setAttribute("msg", "Product deleted successfully!");
            request.getRequestDispatcher("ViewProduct.jsp").forward(request, response);
        }
    }
}
