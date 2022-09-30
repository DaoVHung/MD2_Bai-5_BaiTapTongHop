package ra.dev;

import java.util.Objects;
import java.util.Scanner;

public class ListProduct {
  static Product [] listPro = new Product[1000];
   static int index = 0;

    public static void main(String[] args) {

do {
    Scanner num = new Scanner(System.in);


    System.out.println("   ");
    System.out.println("**************** MENU ***************");
    System.out.println("1. Nhập thông tin cho n sản phẩm (n nhập từ bàn phím)");
    System.out.println("2. Tính giá bán cho tất cả sản phẩm");
    System.out.println("3. Hiển thị thông tin các sản phẩm");
    System.out.println("4. Sắp xếp sản phẩm theo giá bán tăng dần");
    System.out.println("5. Tìm kiếm sản phẩm theo tên sản phẩm");
    System.out.println("6. Thống kê số lượng và in thông tin các sản \n phẩm sắp hết hàng" +
            "(quantity<=5)");
    System.out.println("7. Cập nhật trạng thái của sản phẩm theo mã sản phẩm");
    System.out.println("8. Thoát");
    System.out.println("Nhập vào lựa chọn của bạn !");
    int so = Integer.parseInt(num.nextLine());


    switch (so) {
        case 1:
            System.out.println("Nhập số sản phẩm bạn muốn thêm !");
            int ssp = Integer.parseInt(num.nextLine());
            System.out.println("Nhập thông tin của sản phẩm");
            for (int i = 0; i < ssp; i++) {
                listPro[index] = new Product();
                listPro[index].inputData();
                index++;
            }
            break;
        case 2:
            for (int i = 0; i < index; i++) {
                listPro[i].calExportPrice();
            }
            System.err.println("Giá đã được tính toán");
            break;
        case 3:
            System.out.println("Phan tu trong mang la : ");
            for (int i = 0; i < index; i++) {
                listPro[i].displayData();
            }
            break;
        case 4:

            System.err.println("San pham sau khi sap xep la: ");
            for (int i = 0; i < index-1; i++) {
                for (int j = i+1; j < index; j++) {
                    if (listPro[i].getExportPrice() > listPro[j].getExportPrice()) {
                        Product temp = listPro[i];
                        listPro[i] = listPro[j];
                        listPro[j] = temp;
                    }
                }
            }
            for (int i = 0; i < index; i++) {
                listPro[i].displayData();
            }
            break;
        case 5:
            System.out.println("Nhập sản phẩm bạn muốn tìm ");
            Scanner sc = new Scanner(System.in);
            String TK = sc.nextLine();
            for (int i = 0; i < index; i++) {
//                if (listPro[i].getProductName().startsWith(TK)){
                if(Objects.equals(listPro[i].getProductName(), TK)){
                    System.out.println("Thông tin sản phẩm là ");
                    listPro[i].displayData();
                }else {
                    System.out.println("Không có thông tin !");
                }
            }
            break;
        case 6:
            System.out.println("Thống kê sản phẩm sắp hết hàng :");
            for (int i = 0; i < index; i++) {
                if(listPro[i].getQuantiny()<5){
                    System.out.println(listPro[i].getProductName());
                }
            }
            break;
        case 7:
            for (int i = 0; i < index; i++) {
                if (listPro[i].getProductStatus()){
                    listPro[i].setProductStatus(false);
                }else {
                    listPro[i].setProductStatus(true);
                }
            }
            System.out.println("Trạng thái đã được thay đổi");
            break;
        case 8:
            System.exit(0);
            break;
    }
}while (true);


        }
    }

