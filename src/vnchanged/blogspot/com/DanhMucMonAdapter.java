package vnchanged.blogspot.com;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DanhMucMonAdapter extends ArrayAdapter<DanhMucMon>{

	Activity context = null;
	ArrayList<DanhMucMon> myArray = null;
	int layoutId;
	Typeface customfont;
	
	/**
	 * Constructor này dùng để khởi tạo các giá trị
	 * từ MainActivity truyền vào
	 * @param context: là Activity từ Main
	 * @param layoutId: là layout custom do ta tạo(item_main_layout)
	 * @param arr: Danh sách DanhMucMon truyền từ Main
	 * */
	public DanhMucMonAdapter(Activity context, int layoutId, ArrayList<DanhMucMon> arr, String font) {
		super(context, layoutId, arr);
		this.context = context;
		this.layoutId = layoutId;
		this.myArray = arr;
		
		//Khai báo custom font
		customfont = Typeface.createFromAsset(context.getAssets(), font);
		
	}
	
	 /**
	 * hàm dùng để custom layout, ta phải override lại hàm này
	 * từ MainActivity truyền vào
	 * @param position : là vị trí của phần tử trong danh sách Danhmuc món
	 * @param convertView: convertView, dùng nó để xử lý Item
	 * @param parent : Danh sách danh mục món ăn truyền từ Main
	 * @return View: trả về chính convertView
	 */
	
	public View getView(int position, View convertView, ViewGroup parent){
		LayoutInflater inflater = context.getLayoutInflater();
		convertView = inflater.inflate(layoutId, null);
		
		//Để test thôi, có thể bỏ if
		if(myArray.size()>0 && position >= 0){
			
			//dòng lệnh lấy TextView ra để hiển thị
			final TextView tvcategory = (TextView) convertView.findViewById(R.id.tvCategory);
			
			//set custom font for textview
			tvcategory.setTypeface(customfont);
			
			//lấy danh mục thứ position
			final DanhMucMon danhmuc = myArray.get(position);
			
			//hiển thị text lên TextView category trong item ListView
			tvcategory.setText(danhmuc.getCategory());
			
		}
		
		return convertView;
	}
	
}
