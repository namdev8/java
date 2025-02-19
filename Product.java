public class Product {
    int pcode;
    String pname;
    int pr;

    Product(int var1, String var2, int var3) {
       this.pcode = var1;
       this.pname = var2;
       this.pr = var3;
    }
    
    void display() {
        System.out.println("product code:" + this.pcode);
        System.out.println("product Name:" + this.pname);
        System.out.println("product Price:" + this.pr);
        System.out.println("-------------------");
     }

     public static void main(String[] var0) {
        Product var1 = new Product(1001, "tv", 5000);
        Product var2 = new Product(1002, "Laptop", 55500);
        Product var3 = new Product(1003, "smartphone", 4000);
        System.out.println("Product Details");
        var1.display();
      var2.display();
      var3.display();
      Product var4;
      if (var1.pr < var2.pr && var1.pr < var3.pr) {
         var4 = var1;
      } else if (var2.pr < var3.pr) {
         var4 = var2;
      } else {
         var4 = var3;
      }

      System.out.println("Product with the lowest price:");
      var4.display();
}

}