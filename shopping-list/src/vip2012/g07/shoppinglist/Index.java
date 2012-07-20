package vip2012.g07.shoppinglist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Index extends Activity implements OnClickListener {
	
	Button add;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
//        setContentView(R.layout.layout_add_new_products);
        
        add = (Button) findViewById(R.id.add_btn);
        add.setOnClickListener(this);
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent itAddNewProduct = new Intent(arg0.getContext(), AddNewProduct.class);
		startActivityForResult(itAddNewProduct, 0);
	}
}