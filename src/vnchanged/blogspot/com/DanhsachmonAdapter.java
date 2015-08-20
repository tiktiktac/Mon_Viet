package vnchanged.blogspot.com;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DanhsachmonAdapter extends ArrayAdapter<Danhsachmon> {

	Activity context = null;
	ArrayList<Danhsachmon> myArray = null;
	int layoutId;
	Typeface customfont;
	
	/**
	 * Constructor này dùng để khởi tạo các giá trị
	 * từ DanhsachmonActivity truyền vào
	 * @param context: là Activity từ Danhsachmon
	 * @param layoutId: là layout custom do ta tạo(item_monan)
	 * @param arr: Danh sách Danhsachmon truyền từ Danhsachmon
	 * */
	
	public DanhsachmonAdapter(Activity context, int layoutId, ArrayList<Danhsachmon> arr, String font) {
		super(context, layoutId, arr);
		this.context = context;
		this.layoutId = layoutId;
		this.myArray = arr;
		
		//Khai báo custom font
		customfont = Typeface.createFromAsset(context.getAssets(), font);
	}
	
	 /**
	 * hàm dùng để custom layout, ta phải override lại hàm này
	 * @param position : là vị trí của phần tử trong danh sách danh sách món
	 * @param convertView: convertView, dùng nó để xử lý Item
	 * @param parent : Danh sách danh mục món ăn truyền từ Danhsachmon Activity
	 * @return View: trả về chính convertView
	 */
	
	public View getView(int position, View convertView, ViewGroup parent){
		LayoutInflater inflater = context.getLayoutInflater();
		convertView = inflater.inflate(layoutId, null);
		
		//Để test thôi, có thể bỏ if
		if(myArray.size()>0 && position >= 0){
			
			//lấy danh sách thứ position
			final Danhsachmon danhsach = myArray.get(position);
			
			//Hiển thị hình ảnh đại diện cho món ăn
			final ImageView photo = (ImageView) convertView.findViewById(R.id.imgAnhMon);
			photo.setImageResource(danhsach.getPhoto());
			
			//dòng lệnh lấy TextView ra để hiển thị
			final TextView tvTenMon = (TextView) convertView.findViewById(R.id.tvTenMon);
			
			//set custom font for textview
			tvTenMon.setTypeface(customfont);
			
			//hiển thị text lên TextView category trong item ListView
			tvTenMon.setText(danhsach.getName());
			
		}
		
		return convertView;
	}
	
}
