package vnchanged.blogspot.com;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity {

	ArrayList<DanhMucMon> arrDanhMucMon = new ArrayList<DanhMucMon>();
	DanhMucMonAdapter adapter = null;
	ListView lvCategory = null;
	ImageView imgThongTin = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		lvCategory = (ListView) findViewById(R.id.lvCategory);
		arrDanhMucMon = new ArrayList<DanhMucMon>();

		// Thêm các danh mục món		
		int size = variables.DANHMUC.length;
		for(int i = 0; i < size; i++){
			arrDanhMucMon.add(new DanhMucMon(variables.DANHMUC[i]));
		}

		adapter = new DanhMucMonAdapter(MainActivity.this,
				R.layout.item_main_layout, arrDanhMucMon,
				"fonts/fonttraitim.ttf");

		lvCategory.setAdapter(adapter);

		lvCategory
				.setOnItemClickListener(new AdapterView.OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1,
							int arg2, long arg3) {
						// TODO Auto-generated method stub
						xulyDanhMuc(arg2);
					}
				});

		imgThongTin = (ImageView) findViewById(R.id.imgThongTin);
		imgThongTin.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showInfoDialog();
			}
		});

	}

	public void showInfoDialog() {
		final AlertDialog dia = new AlertDialog.Builder(MainActivity.this)
				.create();

		// lấy file xml từ folder layout
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.thongtintg, null);
		dia.setView(view); // set giao diện
		dia.show();
	}

	public void xulyDanhMuc(int arg2) {
		// Tạo Intent để mở DanhsachmonActivity
		Intent intent = new Intent(MainActivity.this, DanhsachmonActivity.class);

		// Tạo bundle
		Bundle bundle = new Bundle();

		// Chuẩn bị để đưa thể loại vào bundle
		DanhMucMon danhmucmon = arrDanhMucMon.get(arg2);
		String theloai = danhmucmon.getCategory();

		// đưa dữ liệu vào Bundle
		
		bundle.putString("theloai", theloai);
		bundle.putInt("idTheLoai", arg2);

		// Đưa Bundle vào Intent
		intent.putExtra("MyPackage", bundle);

		// Mở Activity DanhsachmonActivity
		startActivity(intent);
		overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

	}

	// Override để xử lý sự kiện ấn nút back khi đang ở màn hình MainActivity
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
			// Hiển thị exit dialog
			showExitDialog();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	private void showExitDialog() {
		// TODO Auto-generated method stub

		// AlertDialog.Builder adb = new Builder(MainActivity.this);
		// adb.setTitle("Xác nhận thoát");
		//
		// adb.setMessage("Bạn muốn thoát ứng dụng?");
		// adb.setIcon(R.drawable.bye1);
		// adb.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener()
		// {
		//
		// @Override
		// public void onClick(DialogInterface arg0, int arg1) {
		// finish();
		// overridePendingTransition(R.anim.push_down_in, R.anim.push_up_out);
		// }
		// });
		//
		// adb.setNegativeButton("Hủy bỏ", new DialogInterface.OnClickListener()
		// {
		//
		// @Override
		// public void onClick(DialogInterface arg0, int arg1) {
		//
		// arg0.dismiss();
		// }
		// });
		//
		// AlertDialog ad = adb.create();
		// ad.show();

		// Custom dialog
		// Tạo một dialog mới
		final AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
				.create();

		// lấy file xml từ folder layout
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.dialog_exit2, null);
		dialog.setView(view); // set giao diện

		Button btnOk = (Button) view.findViewById(R.id.btnOk);
		Button btnCancel = (Button) view.findViewById(R.id.btnCancel);

		// lắng nghe sự kiện click button

		btnOk.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
				overridePendingTransition(R.anim.push_down_in,
						R.anim.push_down_out);
			}
		});

		btnCancel.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dialog.cancel();
			}
		});

		dialog.show();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
