package ninggawhite.restoran;

/**
 * Created by Andriana on 10/24/2016.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ninggawhite.restoran.adapter.Product;
import ninggawhite.restoran.adapter.ProductListAdapter;
import ninggawhite.restoran.utils.SharedPreference;

public class ListMenu extends AppCompatActivity{

    public static final String ARG_ITEM_ID = "product_list";

    ListView productListView;
    List<Product> products, favorite;
    ProductListAdapter productListAdapter;

    SharedPreference sharedPreference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_produk);

        setProducts();
        sharedPreference = new SharedPreference();
        productListAdapter = new ProductListAdapter(getApplicationContext(), products);

        productListView = (ListView) findViewById(R.id.list_product);
        productListView.setAdapter(productListAdapter);

    }

    private void setProducts() {

        Product product1 = new Product(1, "Nasi Gandul", "nasi uduk yang penyajiannya pakai daun pisang", 20000);
        Product product2 = new Product(2, "Nasi Liwet", "Nasi yang diasinkan dan menggunakan santan kelapa", 40000);
        Product product3 = new Product(3, "Nasi Kudus", "Menggunakan Daging Kerbau", 30000);
        Product product4 = new Product(4, "Nasi Grombyang", "Kuah lebih banyak dari pada isi", 50000);
        Product product5 = new Product(5, "Mie Ongklok", "Mie rebus yang diracik bersama dengan kol dan potongan daun kucai.", 48000);

        products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
    }
}
