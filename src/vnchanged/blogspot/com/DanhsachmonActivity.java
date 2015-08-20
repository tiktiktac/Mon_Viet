package vnchanged.blogspot.com;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DanhsachmonActivity extends Activity {
	
	Toast toast;
	ArrayList<Danhsachmon> arrDanhsachmon = null;
	DanhsachmonAdapter adapter = null;
	ListView lvMon = null;
	TextView tvTheLoai = null;
	
	private String theloai;
	private int idTheLoai;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.lits_mon);
		
		//lấy intent gọi Activity này
		 Intent callerIntent=getIntent();
		 
		//có intent rồi lấy Bundle dựa vào MyPackage
		 Bundle packageFromCaller = callerIntent.getBundleExtra("MyPackage");
		 
		//Có Bundle rồi thì lấy id
		 theloai = packageFromCaller.getString("theloai");
		 idTheLoai = packageFromCaller.getInt("idTheLoai");
		
		 hienthiDanhSachMon(idTheLoai);
		 
		 //Lắng nghe sự kiện khi người dùng click vào một món nào đó
		 
		 lvMon.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
				hienthiMonAn(arg2);
				
			}
			 
		});
		 
	}
	
	//set back key press
	  @Override
	    public boolean onKeyDown(int keyCode, KeyEvent event){
	        if (keyCode == KeyEvent.KEYCODE_BACK){
	            finish();
	            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
	            return true;
	        }
	        return super.onKeyDown(keyCode, event);
	    }
	
	
	public void hienthiMonAn(int arg2){
		
		
		//Lấy tên món để chuẩn bị đưa vào bundle
		final Danhsachmon monan = arrDanhsachmon.get(arg2);
		//lấy kích thước ArrayList để hiển thị ở bên MonAnActivity
		final int size = arrDanhsachmon.size();
		String name = monan.getName();
		
		//Tạo Intent để mở DanhsachmonActivity
		Intent intent = new Intent(DanhsachmonActivity.this, MonAnActivity.class);
		
		//Tạo bundle
		Bundle bundle = new Bundle();
		
		//Lấy id của danh sách món, tức là arg2
		
		//đưa dữ liệu vào Bundle
		bundle.putInt("id", arg2);
		bundle.putString("name", name);
		bundle.putInt("idTheLoai", idTheLoai);
		bundle.putInt("arrsize", size);
		
		//Đưa Bundle vào Intent
		 intent.putExtra("MyPackage", bundle);
		 
		//Mở Activity MonAnActivity
		 startActivity(intent);
		 overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
		
	}
	
	
	public void hienthiDanhSachMon(int idTheLoai){
		
		tvTheLoai = (TextView) findViewById(R.id.tvTheLoai);
		Typeface customfont = Typeface.createFromAsset(getAssets(), "fonts/fonttraitim.ttf");
		tvTheLoai.setTypeface(customfont);
		tvTheLoai.setText(theloai);
		
		arrDanhsachmon = new ArrayList<Danhsachmon>();
		
		adapter = new DanhsachmonAdapter(DanhsachmonActivity.this, R.layout.item_monan, arrDanhsachmon, "fonts/OngDo.ttf");
		lvMon = (ListView) findViewById(R.id.lvMon);
		
		switch(idTheLoai){
		
		case 0:
			int size = variables.MONCOM.length;
			for(int i = 0; i < size; i++){
				arrDanhsachmon.add(new Danhsachmon(variables.MONCOM[i], variables.IMGMONCOM[i]));
			}
			
			
			//set adapter
			lvMon.setAdapter(adapter);
			break;
			
		case 1:
			size = variables.MONXAO.length;
			for(int i = 0; i < size; i++){
				arrDanhsachmon.add(new Danhsachmon(variables.MONXAO[i], variables.IMGMONXAO[i]));
			}
			
			//set adapter
			lvMon.setAdapter(adapter);
			break;
			
		case 2:
			size = variables.MONCANHVACA.length;
			for(int i = 0; i < size; i++){
				arrDanhsachmon.add(new Danhsachmon(variables.MONCANHVACA[i], variables.IMGMONCANHVACA[i]));
			}
			
			//set adapter
			lvMon.setAdapter(adapter);
			break;
			
		case 3:
			size = variables.MONBUN.length;
			for(int i = 0; i < size; i++){
				arrDanhsachmon.add(new Danhsachmon(variables.MONBUN[i], variables.IMGMONBUN[i]));
			}
			
			//set adapter
			lvMon.setAdapter(adapter);
			break;
			
		case 4:
			size = variables.MONCHE.length;
			for(int i = 0; i < size; i++){
				arrDanhsachmon.add(new Danhsachmon(variables.MONCHE[i], variables.IMGMONCHE[i]));
			}
			
			//set adapter
			lvMon.setAdapter(adapter);
			break;
			
		case 5:
			size = variables.MONBOBOCAU.length;
			for(int i = 0; i < size; i++){
				arrDanhsachmon.add(new Danhsachmon(variables.MONBOBOCAU[i], variables.IMGMONBOBOCAU[i]));
			}
			
			//set adapter
			lvMon.setAdapter(adapter);
			break;
			
		case 6:
			size = variables.MONBANH.length;
			for(int i = 0; i < size; i++){
				arrDanhsachmon.add(new Danhsachmon(variables.MONBANH[i], variables.IMGMONBANH[i]));
			}
			
			//set adapter
			lvMon.setAdapter(adapter);
			break;
			
		case 7:
			size = variables.MONGA.length;
			for(int i = 0; i < size; i++){
				arrDanhsachmon.add(new Danhsachmon(variables.MONGA[i], variables.IMGMONGA[i]));
			}
			
			//set adapter
			lvMon.setAdapter(adapter);
			break;
			
		case 8:
			size = variables.MONGOI.length;
			for(int i = 0; i < size; i++){
				arrDanhsachmon.add(new Danhsachmon(variables.MONGOI[i], variables.IMGMONGOI[i]));
			}
			
			//set adapter
			lvMon.setAdapter(adapter);
			break;
			
		case 9:
			size = variables.MONTET.length;
			for(int i = 0; i < size; i++){
				arrDanhsachmon.add(new Danhsachmon(variables.MONTET[i], variables.IMGMONTET[i]));
			}
			
			//set adapter
			lvMon.setAdapter(adapter);
			break;
			
		case 10:
			size = variables.MONKHAC.length;
			for(int i = 0; i < size; i++){
				arrDanhsachmon.add(new Danhsachmon(variables.MONKHAC[i], variables.IMGMONKHAC[i]));
			}
			
			//set adapter
			lvMon.setAdapter(adapter);
			break;			
		}
	}

}
