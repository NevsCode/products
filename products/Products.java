package products;

import java.util.ArrayList;
import java.util.Scanner;


public class Products 
{
    /*
    
    */
    static String product_code;
    static String product_name;
    static String product_category;
    static String product_warranty;
    static double product_price;
    static int product_level;
    static String product_supplier;
    static final int LIMIT = 1;
    static String product_search;
    static String product_update;
    static String productUpdate_code;
    static String product_delete;
    static String user_entry ;
    static int totalProduct_counter;
    static int counter = 0;
    
    public static void Display()
    {
        Scanner userinput = new Scanner(System.in);//
        ArrayList<String>code = new ArrayList();
        ArrayList<String>productnames = new ArrayList();
        ArrayList<String>warranty = new ArrayList();
        ArrayList<String> supplier= new ArrayList();
        ArrayList<Integer>level = new ArrayList();
        ArrayList<String>category = new ArrayList();
        ArrayList<Double> price= new ArrayList();
        /*
        
        */
        String TITLE = "bright future technologies application";
        System.out.println(TITLE.toUpperCase());
        System.out.println("**************************************");
        System.out.println("Enter (1) to launch menu or any other key to eixt");
        user_entry = userinput.nextLine();
        int menu_items;
        /*
        
        */
        while(user_entry.equals("1"))
        {
            Products.DisplayMenu(user_entry);
            System.out.print("Please choose you menu items: ");
            menu_items = userinput.nextInt();
            /*
            
            */
            switch(menu_items)
            {
                case 1:
                   Products.CaptureProduct(code,productnames,category, warranty ,price ,level, supplier);
                   counter += 1;
                   break;
                case 2:
                   Products.SearchProduct(code,productnames,category, warranty ,price ,level, supplier);
                   break; 
                case 3:
                   Products.UpdateProduct(code,productnames,category, warranty ,price ,level, supplier);
                   break;
                case 4:
                   Products.DeleteProduct(code,productnames,category, warranty ,price ,level, supplier);
                   break; 
                case 5:
                   Products.PrintReport(code,productnames,category, warranty ,price ,level, supplier);
                   break;
                case 6:
                   Products.DisplayUpdate(code,productnames,category, warranty ,price ,level, supplier);
                   break;
            }
            /*
            
            */
            if(menu_items == 7)
            {
               Products.EixtApplication();
               break;  
            }
            System.out.println("Enter (1) to launch menu or any other key to eixt ");//
            user_entry = userinput.next();
        }
    }
        
    
    public static void CaptureProduct(ArrayList<String>code , ArrayList<String> name 
        ,ArrayList<String>category , ArrayList<String>warranty, ArrayList<Double>price
        ,ArrayList<Integer> level,ArrayList<String>supplier)//
    {
        ReportDate report = new ReportDate();
        Scanner userinput = new Scanner(System.in);
        /*
        
        */
        String tilte = "capture a new product";
        System.out.println(tilte.toUpperCase());
        System.out.println("*********************");
        System.out.print("Enter the product name: ");
        product_name = userinput.next();
        for(int n = 0; n < LIMIT;n++ )
        {
           report.setName(product_name);
           name.add(product_name);
        }
        
        System.out.print("Enter the Product code: ");
        product_code = userinput.next();
        for(int j = 0;j < LIMIT;j++)
        {
            report.setCode(product_code);
            code.add(product_code);
        }
        System.out.println("Select the product category: \nDesktop Computer - 1 \nLaptop - 2 \nTablet - 3 \nPrinter - 4 \nGaming Consolo - 5");
        product_category = userinput.next();
        /*
        
        */
        int i;
        for( i = 0; i < LIMIT;i++)
        {
            report.setCategory(product_category);
            switch(product_category)
            {
                case "1":
                    System.out.println("Product Category >> " +  report.getCategory());
                    category.add("Computer");
                    break;
                case "2":
                   
                    System.out.println("Product Category >> " + report.getCategory() );
                    category.add("Laptop");
                    break;    
                case "3":
                    
                    System.out.println("Product Category >> " +  report.getCategory());
                    category.add("Tablet");
                    break;
                case "4":
                    
                    System.out.println("Product Category >> " +  report.getCategory());
                    category.add("Printer");
                    break;
                case "5":
                    System.out.println("Product Category >> " +  report.getCategory());
                    category.add("Gaming Consolo");
                    break;
                default:
                    System.out.println("invalid product category! choose from 1,2,3,4, and 5 please");
                    System.out.print("please re-enter a valid product category: ");
                    product_category = userinput.next();
                    report.setCategory(product_category);
                    switch(product_category)
                    {
                        case "1":
                           category.add("Computer");
                           break;
                        case "2":
                           category.add("Laptop");
                           break;
                        case "3":
                           category.add("Tablet");
                           break;
                        case "4":
                           category.add("Tablet");
                           break;
                        case "5":
                            category.add("Printer"); 
                            break;
                        case "6":
                            category.add("Gaming Consolo");
                            break;
                            
                    }
                    
            }
            
        }
        System.out.print("Indicate the product warranty. Enter (1) for 6 months or any other key to for 2 years. " );//
        product_warranty = userinput.next();
        /*
        
        */
        for(int w = 0; w < LIMIT;w++)
        {
           if(product_warranty.equals("1"))
           {
               warranty.add(" 6 months");
           }
           else
           {
                warranty.add("2 years");
           }
        }
        System.out.print("Enter the price for " + report.getName() + " >> ");
        product_price = userinput.nextDouble();
        for(int p = 0; p < LIMIT;p++)
        {
           report.setPrice(product_price);
           price.add(product_price);
          
        }
        
        System.out.print("Enter the stock level for " + report.getName() + " >> ");
        product_level = userinput.nextInt();
        for(int l = 0;l < LIMIT;l++ )
        {
           report.setLevel(product_level);
           level.add(product_level);
        }
        
        System.out.print("Enter the supplier for " + report.getName() + " >> ");
        product_supplier = userinput.next();
        for(int s = 0; s < LIMIT;s++)
        {
            report.setSupplier(product_supplier);
            supplier.add(product_supplier);
        }
        SavaProduct();
    }
    /*
    
    */
    public static void DisplayMenu(String user_entry)
    {
        System.out.println("Please select one of the following menu items: \n(1) Capture a new product."
        + " \n(2) Search for a product \n(3) Update a product."
        + " \n(4) Delete a product. \n(5) Print report." + "\n(6) Display update"
        + " \n(7) Eixt Application. ");
    }
    /*
    
    */
    public static void UpdateProduct(ArrayList<String>code , ArrayList<String> name
        ,ArrayList<String>category , ArrayList<String>warranty, ArrayList<Double>price
        ,ArrayList<Integer> level,ArrayList<String>supplier)
    {
        /*
        
        */
        System.out.println("");
        ReportDate report = new ReportDate();
        Scanner userinput = new Scanner(System.in);
        System.out.print("Please enter the product code to update: ");
        productUpdate_code = userinput.nextLine();
        int i;
        for(i = 0;i < name.size();i= i+1)
        {
            String confirm_update;
            String update_choice;
            if(code.get(i).equalsIgnoreCase(productUpdate_code))
            {
               
                System.out.print("Please confirm whether you want to update (y) for yes and (n) for no: ");
                confirm_update = userinput.nextLine();
                if(confirm_update.equalsIgnoreCase("y"))
                {
                    System.out.print("Update the product warranty? (y) yes, and (n)No: ");
                    update_choice = userinput.nextLine();
                    if(update_choice.equalsIgnoreCase("y"))
                    {
                        System.out.print("Indicate the product warranty. Enter (1) for 6 months or any other key to for 2 years. ");
                        product_warranty = userinput.nextLine();
                        report.setWarranty(product_warranty);
                        if(product_warranty.equals("1"))
                        {
                            warranty.add(" 6 months");  //
                        }
                        else
                        {
                            warranty.add("2 years");  //
                        }
                    }
                }
                /*
                
                */
                System.out.print("Update the prodict price? (y) yes, and (n)No: ");
                update_choice = userinput.nextLine();
                report.setName(product_name);
                if(update_choice.equalsIgnoreCase("y"))
                {
                    System.out.print("Enter the new price for " + report.getName() + " >> ");
                    product_price = userinput.nextDouble();
                    report.setPrice(product_price);
                    price.add(product_price);
                }
                System.out.print("Update the prodict stock level? (y) yes, and (n)No: ");
                update_choice = userinput.next();
                report.setLevel(product_level);
                if(update_choice.equalsIgnoreCase("y"))
                {
                    System.out.print("Enter the stock level for " + report.getLevel() + " >> ");
                    product_level = userinput.nextInt();
                    level.add(product_level);
                }
                System.out.println("");
                break;
            }
        }
        if(!code.contains(productUpdate_code))
        {
            System.out.println("The product cannot be located.Invalid Product");
        }
    }
    /*
    
    */
    public static void DisplayUpdate(ArrayList<String>code , ArrayList<String> name
        ,ArrayList<String>category , ArrayList<String>warranty, ArrayList<Double>price
        ,ArrayList<Integer> level,ArrayList<String>supplier)
    {
        //
        ReportDate report = new ReportDate();
        Scanner userinput = new Scanner(System.in);
        //
        System.out.print("Please enter the product code to update: ");
        productUpdate_code = userinput.nextLine();
        for(int i =0;i < name.size();i++)
        {
            if(code.get(i).equalsIgnoreCase(productUpdate_code))
            {
                System.out.println("**************************************");
                System.out.println("UPDATE DATAILS");
                System.out.println("**************************************");
                report.setCode(product_code);
                System.out.println("PRODUCT CODE >> " + code.get(i));
                report.setName(product_name);
                System.out.println("PRODUCT NAME >> " +  name.get(i));
                if(product_warranty.equals("1"))
                {
                    report.setWarranty( "PRODUCT CATEGORY >> " + "6 Months");
                }else
                {
                    report.setWarranty("PRODUCT CATEGORY >> " + "2 years");
                }
                System.out.println(report.getWarranty());
                report.setWarranty(product_warranty);
                System.out.println("PRODUCT WARRANTY >> " + category.get(i));
                report.setPrice(product_price);
                System.out.println("PRODUCT PRICE >> " + report.getPrice() );
                report.setLevel(product_level);
                System.out.println("PRODUCT LEVEL >> " + report.getLevel());
                report.setSupplier(product_supplier);
                System.out.println("PRODUCT SUPPLIER >> " + supplier.get(i) );
                System.out.println("*********************************************");
            }
        }
        if(!code.contains(productUpdate_code))
        {
            System.out.println("The product cannot be located.Invalid Product");
        }
    }
    
    public static void SearchProduct(ArrayList<String>code , ArrayList<String> name
        ,ArrayList<String>category , ArrayList<String>warranty, ArrayList<Double>price
        ,ArrayList<Integer> level,ArrayList<String>supplier)
    {
        /*
        
        
        */
        Scanner userinput = new Scanner(System.in);
        System.out.print("Please enter the product code to search: " );
        product_search = userinput.nextLine();
        System.out.println("*************************************");
        System.out.println("PRODUCT SEARCH RESULTS");
        System.out.println("**************************************");
        /*
        
        */
        for(int i = 0; i < name.size();i++)
        {
            if(code.get(i).equalsIgnoreCase(product_search))
            {
                System.out.println("PRODUCT CODE >> " + code.get(i) + "\nPRODUCT NAME >> " + name.get(i));
                
                switch(product_category)
                {
                    case "1":
                        System.out.println("PRODUCT WARRANTY >> " +  category.get(i));
                        break;
                    case "2":
                        System.out.println("PRODUCT WARRANTY >> " +  category.get(i));
                        break;    
                    case "3":
                        System.out.println("PRODUCT WARRANTY >> " +  category.get(i));
                        break;
                    case "4":
                        System.out.println("PRODUCT WARRANTY >> " +  category.get(i));
                        break;
                    case "5":
                        System.out.println("PRODUCT WARRANTY >> " + category.get(i));
                        break;
                    
                }
                if(product_warranty.equalsIgnoreCase("1"))
                {
                    System.out.println("PRODUCT CATEGORY >> " + warranty.get(i));
                }else
                {
                    System.out.println("PRODUCT  CATEGORY >> " + warranty.get(i));
                }
                System.out.println("PRODUCT PRICE >> " + " R" + price.get(i)
                + "\nPRODUCT LEVEL >> " + level.get(i) + "\nPRODUCT SUPPLIER >> " + supplier.get(i) );
            }
        }
        if(!code.contains(product_search))
        {
            System.out.println("The product cannot be located.Invalid Product");
        }
        System.out.println("*******************************************");
    }
    
    public static void SavaProduct()
    {
        System.out.println("Product  details has been saved successfully");
    }
    /*
    
    */
    public static void DeleteProduct(ArrayList<String>code , ArrayList<String> name
        ,ArrayList<String>category , ArrayList<String>warranty, ArrayList<Double>price
        ,ArrayList<Integer> level,ArrayList<String>supplier)
    {
        Scanner userinput = new Scanner(System.in);
        System.out.print("Please enter the product code to search: " );
        product_delete = userinput.nextLine();
        int i;
        for(i = 0;i < code.size() ;i++)
        {
            String delete;
            if(code.get(i).equalsIgnoreCase(product_delete))
            {
                System.out.print("Please confirm whether you want to delete (y) for yes and (n) for no: ");
                delete = userinput.nextLine();
                if(delete.equalsIgnoreCase("y"))
                {
                    code.remove(i);
                    name.remove(i);
                    warranty.remove(i); 
                    category.remove(i); 
                    price.remove(i);
                    level.remove(i) ;
                    supplier.remove(i);
                    counter -= 1;
                    
                } else if(delete.equalsIgnoreCase("n"))
                {
                    code.get(i);
                    name.get(i);
                    warranty.get(i); 
                    category.get(i); 
                    price.get(i);
                    level.get(i) ;
                    supplier.get(i);
                }
               
            }
            break;
        }
        if(!code.contains(product_delete))
        {
            System.out.println("The product cannot be located.Invalid Product");
        }
    }
    /*
    
    */
   
    public static void EixtApplication()
    {
        String eixt;
        Scanner userinput = new Scanner(System.in);
        System.out.print("please confirn if you want to eixt the program enter only key " );
        eixt = userinput.nextLine();
        if(eixt.equalsIgnoreCase("any keys"))
        {
            System.out.println("you have eixt the program thanks");
           
        }
    }
    
    public static void PrintReport(ArrayList<String>code , ArrayList<String> name
        ,ArrayList<String>category , ArrayList<String>warranty, ArrayList<Double>price
        ,ArrayList<Integer> level,ArrayList<String>supplier)
    {
        int product_counter = 0;
        
        System.out.println("PRODUCT REPORT");
        
        for(int i = 0 ;i < counter ; i++)
        { 
            product_counter += 1;
            System.out.println("===========================================");
            System.out.println("PRODUCT >> " + product_counter);
            System.out.println("*******************************************");
            System.out.println("PRODUCT CODE >> " + code.get(i) + "\nPRODUCT NAME >> " + name.get(i));
            /*
            
            */
            switch(product_category)
            {
                case "1":
                    System.out.println("PRODUCT WARRANTY >> " + category.get(i));
                    break;
                case "2":
                    System.out.println("PRODUCT WARRANTY >> " + category.get(i));
                    break;    
                case "3":
                    System.out.println("PRODUCT WARRANTY >> " + category.get(i));
                    break;
                case "4":
                   System.out.println("PRODUCT WARRANTY >> " + category.get(i));
                    break;
                case "5":
                    System.out.println("PRODUCT WARRANTY >> " + category.get(i));
                    break;
           }
            /*
            
            */
            if(product_warranty.equalsIgnoreCase("1"))
            {
                System.out.println("PRODUCT CATEGORY >> " + warranty.get(i));
            }else
            {
                System.out.println("PRODUCT  CATEGORY>> " + warranty.get(i));
            }
            
            System.out.println("PRODUCT PRICE >> " + " R" + price.get(i)
            + "\nPRODUCT LEVEL >> " + level.get(i) + "\nPRODUCT SUPPLIER >> " + supplier.get(i) );
            System.out.println("*******************************************");
            totalProduct_counter += price.get(i);
        
        }
        /*
        
        */
        System.out.println("===========================================");
        try{
            double avarege_value = totalProduct_counter /counter ;
            System.out.println("TOTAL PRODUCT COUNT >> " + counter);
            System.out.println("TOTAL PRODUCT VALUE >> " + totalProduct_counter);
            System.out.println("AVERAGE PRODUCT VALUE >> " + avarege_value );
        }
        catch(ArithmeticException mistake)
        {
            System.out.println("there's no product to print");
        }
       
        System.out.println("============================================"); 
        
    }
    
}
