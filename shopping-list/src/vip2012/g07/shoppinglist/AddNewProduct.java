package vip2012.g07.shoppinglist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AddNewProduct extends Activity implements OnClickListener {

	private Button add;
	private Button cancel;
	private Button moreOptions;
	
	private EditText title;
	private EditText priority;
	private ItemsDataSource dataSource;
	
	public AddNewProduct() {
		// TODO Auto-generated constructor stub
	}

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.layout_add_new_products);
        
//        dataSource = new ItemsDataSource(this);
//        dataSource.open();
        
        add = (Button) findViewById(R.id.btn_create);
        cancel = (Button) findViewById(R.id.btn_cancel);
        moreOptions = (Button) findViewById(R.id.btn_more_option);
        title = (EditText) findViewById(R.id.edit_new_title);
        priority = (EditText) findViewById(R.id.edit_new_priority);
        
        add.setOnClickListener(this);
        cancel.setOnClickListener(this);
        moreOptions.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_create:
			String text = title.getText().toString().trim();
			if(text == null || text.equals("") ) {
				// TODO In thong bao loi
				;
			} else {
				// insert vao csdl;
				if(priority.getText().toString().trim() == null)
					Log.i("priority", "null");
				else 
					Log.i("priority not null", priority.getText().toString().trim());
			}
			break;
			
		case R.id.btn_cancel:
//			dataSource.close();
			Intent intent = new Intent();
			setResult(RESULT_OK, intent);
			finish();
			break;
			
		case R.id.btn_more_option:
			break;
		
		}
	}
}
