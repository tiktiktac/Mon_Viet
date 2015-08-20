package vnchanged.blogspot.com;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MonAnActivity extends Activity {
	
	private WebView browser;
	private String url = "";
	private TextView tvTieuDeMon = null, tvChiSo = null;
	private Button btnBack = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_mon_an);
//		tvTieuDeMon.setSelected(true);
		
		//lấy intent gọi Activity này
		 Intent callerIntent=getIntent();
		 
		//có intent rồi lấy Bundle dựa vào MyPackage
		 Bundle packageFromCaller = callerIntent.getBundleExtra("MyPackage");
		 
		//Có Bundle rồi thì lấy id và tên món và thể loại, size
		 int id = packageFromCaller.getInt("id");
		 String name = packageFromCaller.getString("name");
		 int idTheLoai = packageFromCaller.getInt("idTheLoai");
		 int size = packageFromCaller.getInt("arrsize");
		 
		 //Set tên món
		 tvTieuDeMon = (TextView) findViewById(R.id.tvTieuDeMon);
//		 tvTieuDeMon.setSelected(true);
		 Typeface customfont = Typeface.createFromAsset(getAssets(), "fonts/OngDo.ttf");
		 tvTieuDeMon.setTypeface(customfont);
		 tvTieuDeMon.setText(name);
		 
		 
		 //Set chỉ số của page
		 tvChiSo = (TextView) findViewById(R.id.tvChiSo);
		 tvChiSo.setText((id+1)+"/"+size);
		 
		 //set url theo thể loại và id
		 
		 url = "file:///android_asset/";
		 
		 switch(idTheLoai){
		 case 0: //trường hợp thể loại là Bí quyết nấu cơm
			 url = url + "mon_com/"+(id+1)+".html";
			 //id+1 bởi vì file html trong csdl bắt đầu từ 1 mà id món thì bắt đầu từ 0
			 break;
			 
		 case 1: //trường hợp thể loại là Món xào hấp dẫn
			 url = url + "mon_xao/"+(id+1)+".html";
			 //id+1 bởi vì file html trong csdl bắt đầu từ 1 mà id món thì bắt đầu từ 0
			 break;
			 
		 case 2: //trường hợp thể loại là Nấu canh và cá
			 url = url + "mon_canhvaca/"+(id+1)+".html";
			 //id+1 bởi vì file html trong csdl bắt đầu từ 1 mà id món thì bắt đầu từ 0
			 break;
			 
		 case 3: //trường hợp thể loại là Bí quyết nấu bún
			 url = url + "mon_bun/"+(id+1)+".html";
			 //id+1 bởi vì file html trong csdl bắt đầu từ 1 mà id món thì bắt đầu từ 0
			 break;
			 
		 case 4: //trường hợp thể loại là Bí quyết nấu chè
			 url = url + "mon_che/"+(id+1)+".html";
			 //id+1 bởi vì file html trong csdl bắt đầu từ 1 mà id món thì bắt đầu từ 0
			 break;
			 
		 case 5: //trường hợp thể loại là Bí quyết nấu bò
			 url = url + "mon_bo_bocau/"+(id+1)+".html";
			 //id+1 bởi vì file html trong csdl bắt đầu từ 1 mà id món thì bắt đầu từ 0
			 break;
			 
		 case 6: //trường hợp thể loại là Bí quyết làm bánh
			 url = url + "mon_banh/"+(id+1)+".html";
			 //id+1 bởi vì file html trong csdl bắt đầu từ 1 mà id món thì bắt đầu từ 0
			 break;
			 
		 case 7: //trường hợp thể loại là Bí quyết nấu gà
			 url = url + "mon_ga/"+(id+1)+".html";
			 //id+1 bởi vì file html trong csdl bắt đầu từ 1 mà id món thì bắt đầu từ 0
			 break;
			 
		 case 8: //trường hợp thể loại là Bí quyết nấu gỏi
			 url = url + "mon_goi/"+(id+1)+".html";
			 //id+1 bởi vì file html trong csdl bắt đầu từ 1 mà id món thì bắt đầu từ 0
			 break;
			 
		 case 9: //trường hợp thể loại là Món Tết cổ truyền
			 url = url + "mon_tet/"+(id+1)+".html";
			 //id+1 bởi vì file html trong csdl bắt đầu từ 1 mà id món thì bắt đầu từ 0
			 break;
			 
		 case 10: //trường hợp thể loại là Nấu món khác
			 url = url + "mon_khac/"+(id+1)+".html";
			 //id+1 bởi vì file html trong csdl bắt đầu từ 1 mà id món thì bắt đầu từ 0
			 break;
			 
		default:
				Toast toast = Toast.makeText(MonAnActivity.this, "Chả có gì^^", Toast.LENGTH_LONG); toast.show();
				break;
		 }
		 
		 
		btnBack = (Button) findViewById(R.id.btnBack);
		btnBack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(browser.canGoBack()){
	                browser.goBack();
	            }
				else{
	                finish();
	                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	            }
//				finish();
//				overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
			}
		});
		
		
		browser = (WebView) findViewById(R.id.webkit);
        browser.setBackgroundColor(0);
        //support zoom in the webview
        browser.getSettings().setBuiltInZoomControls(true);
        browser.getSettings().setSupportZoom(true);
        browser.loadUrl(url);
//        tvTieuDeMon.setSelected(true);
		
	}
	
	//set back press animation
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if (keyCode == KeyEvent.KEYCODE_BACK){
//            finish();
//            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        	if(browser.canGoBack()){
                browser.goBack();
            }
			else{
                finish();
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mon_an, menu);
		return true;
	}

}
