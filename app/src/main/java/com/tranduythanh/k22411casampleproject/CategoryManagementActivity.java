package com.tranduythanh.k22411casampleproject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.tranduythanh.models.Category;
import com.tranduythanh.models.ListCategory;
import com.tranduythanh.models.ListProduct;
import com.tranduythanh.models.Product;

public class CategoryManagementActivity extends AppCompatActivity {

    ListView lvcategory;
    ArrayAdapter<Category> adapter;
    ListCategory lca = new ListCategory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_category_management);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addViews();
    }

    private void addViews() {
        lvcategory=findViewById(R.id.lvcategory);
        adapter = new ArrayAdapter<>(CategoryManagementActivity.this,android.R.layout.simple_list_item_1);

        lca.generate_sample_dataset();
        adapter.addAll(lca.getCategory());
        adapter.notifyDataSetChanged();
        lvcategory.setAdapter(adapter);
    }
}