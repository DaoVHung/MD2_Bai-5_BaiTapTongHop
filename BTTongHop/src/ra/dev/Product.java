package ra.dev;

import java.util.Scanner;
public class Product {
    private String productId;
    private String productName;
    private String title;
    private float importPrice;
    private float exportPrice;
    private int quantiny;
    private String descriptions;
    private Boolean productStatus;

    public Product() {
    }

    public Product(String productId, String productName, String title,
                   float importPrice, float exportPrice, int quantiny, String descriptions, Boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantiny = quantiny;
        this.descriptions = descriptions;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantiny() {
        return quantiny;
    }

    public void setQuantiny(int quantiny) {
        this.quantiny = quantiny;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Product ID : ");
        this.productId = sc.nextLine();
        System.out.println("ProductName");
        this.productName = sc.nextLine();
        System.out.println("Title");
        this.title = sc.nextLine();
        System.out.println("ImporPrice");
        this.importPrice = Float.parseFloat(sc.nextLine());
        System.out.println("Quantiny");
        this.quantiny = Integer.parseInt(sc.nextLine());
        System.out.println("Deccription");
        this.descriptions = sc.nextLine();
        System.err.println("Product Status");
        this.productStatus = Boolean.parseBoolean(sc.nextLine());
        System.out.println("******************");
    }
    public void displayData(){
//        System.out.printf("%-15s%-30s%-30s%-15f%-15f%-10d%-50s10b\n",this.productId,this.productName,this.title,
//                this.importPrice,this.exportPrice,this.quantiny,this.descriptions,this.productStatus);

        System.out.println("Product: \n" +
                " Product ID     :   "+ this.productId     +"\n"+
                " Product Name   :   "+ this.productName   +"\n"+
                " Title          :   "+ this.title         +"\n"+
                " ImporPrice     :   "+ this.importPrice   +"\n"+
                " ExportPrice    :   "+ this.exportPrice   +"\n"+
                " Quantiny       :   "+ this.quantiny      +"\n"+
                " Deccription    :   "+ this.descriptions  +"\n"+
                " Product Status :   "+ this.productStatus +"\n");
    }
    public void calExportPrice(){
        this.exportPrice =this.importPrice*1.2F;
    }




}
