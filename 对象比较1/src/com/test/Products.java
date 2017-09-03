package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Describe:
 * <p>
 * Author: lzl
 * <p>
 * Time: 2017/5/11 下午4:50
 */
public class Products {
    private String title;
    private int price;

    public Products() {
    }

    public Products(String title, int price) {
        super();
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "title=" + title + ",price=" + price + "\n";
    }

    public static void main(String[] args) {
        List<Products> product
                = new ArrayList<Products>();
        product.add(new Products("a", 120));
        product.add(new Products("b", 143432));
        product.add(new Products("c", 1892));
        product.add(new Products("d", 11092));
        Collections.sort(product, new ProductCompare());
        System.out.println(product);
//        结果:
//           [title=b,price=143432
//        title=d,price=11092
//        title=c,price=1892
//        title=a,price=120
//           ]

    }
}
