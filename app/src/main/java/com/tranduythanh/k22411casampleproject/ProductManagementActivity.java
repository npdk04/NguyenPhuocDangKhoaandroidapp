package com.tranduythanh.k22411casampleproject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.tranduythanh.models.ListProduct;
import com.tranduythanh.models.Product;

public class ProductManagementActivity extends AppCompatActivity {


    ListView lvproduct;
    ArrayAdapter<Product> adapter;
    ListProduct lp = new ListProduct();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_management);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addViews();
    }
    private void addViews() {
        lvproduct=findViewById(R.id.lvproduct);
        adapter = new ArrayAdapter<>(ProductManagementActivity.this,android.R.layout.simple_list_item_1);

        lp.generate_sample_dataset();
        adapter.addAll(lp.getProduct());
        adapter.notifyDataSetChanged();
        lvproduct.setAdapter(adapter);
    }
}
