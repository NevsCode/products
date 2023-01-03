package products;

public class ReportDate {
    /*
    
    */
    String product_code;
    String product_name;
    String product_category;
    String product_warranty;
    double product_price;
    int product_level;
    String product_supplier;
    /*
    
    */
    public void setCode(String Product_code)
    {
        this.product_code = Product_code;
    }
    
    public String getCode()
    {
        return product_code;
    }
    
    public void setName(String Product_name )
    {
        this.product_name = Product_name;
    }
    
    public String getName()
    {
        return product_name;
    }
    
    public void setCategory(String Product_category )
    {
        this.product_category = Product_category;
    }
    
    public String getCategory()
    {
        return product_category;
    }
    
    public void setWarranty(String Product_warranty)
    {
        this.product_warranty = Product_warranty;
    }
    
    public String getWarranty()
    {
        return product_warranty;
    }
    
    public void setPrice(double Product_price)
    {
        this.product_price = Product_price;
    }
    
    public double getPrice()
    {
        return product_price;
    }
    
    public void setLevel(int Product_level)
    {
        this.product_level = Product_level;
    }
    
    public int getLevel()
    {
        return product_level;
    }
    
    public void setSupplier(String product_supplier)
    {
        this.product_supplier  = product_supplier;
    }
    
    public String getSupplier()
    {
        return product_supplier;
    }
    
}
