package vnchanged.blogspot.com;

//Class lưu trữ tên Danh mục, tên các món ăn và đường dẫn hình ảnh của chúng.
public class variables {
	
	//Lưu trữ tên danh mục
	public static final String DANHMUC[] = {
		"Bí quyết nấu cơm",
		"Món xào hấp dẫn",
		"Nấu canh, nấu cá",
		"Bí quyết nấu bún",
		"Bí quyết nấu chè",
		"Nấu bò, bồ câu",
		"Bí quyết làm bánh",
		"Bí quyết nấu gà",
		"Bí quyết nấu gỏi",
		"Món Tết cổ truyền",
		"Nấu món khác"
		//Sum: 11
	};
	
	//Lưu trữ tên món
	public static final String MONCOM[] = {
		"CƠM ÂM PHỦ",
		"CƠM CHIÊN HOÀNG HẬU",
		"CƠM GÀ HẢI NAM",
		"CƠM GÀ LẠP XƯỞNG",
		"CƠM HẾN",
		"CƠM LÁ SEN",
		"CƠM SƯỜN TÂN BIÊN",
		"CƠM TAY CẦM",
		"CƠM CHÁY SỐT NẤM TỦY",
		"CƠM CUỘN NGON",
		"CƠM RANG XÁ XÍU",
		"CƠM TẤM SÀI GÒN",
		"CƠM GÀ HỘI AN",
		"CƠM GHẸ PHÚ QUỐC",
		"CƠM HẾN HUẾ",
		"CƠM CHÁY NINH BÌNH",
		"CƠM LAM TÂY BẮC",
		"NẤU CƠM NIÊU",
		"CƠM NỊ CHĂM",
		"CƠM HẤP NƯỚC DỪA",
		//Sum: 20
	};
	
	//Lưu trữ ảnh món
	public static final int IMGMONCOM[] = {
		R.drawable.caphu,
		R.drawable.cchhau,
		R.drawable.cghnam,
		R.drawable.cgnxuong,
		R.drawable.chen,
		R.drawable.clxen,
		R.drawable.cxtbien,
		R.drawable.ctcam,
		R.drawable.ccsntuy,
		R.drawable.cctrung,
		R.drawable.crtxxiu,
		R.drawable.ctam,
		R.drawable.cghan,
		R.drawable.cgpquoc,
		R.drawable.comhen,
		R.drawable.ccnbinh,
		R.drawable.clam,
		R.drawable.cnieu,
		R.drawable.cni,
		R.drawable.chndua,
		//Sum: 20
	};
	
	public static final String MONXAO[] = {
		"ĐẬU PHỤ XÀO GIÁ ĐỖ",
		"HẾN XÀO LÁ LỐT LÀM NHANH",
		"BẠCH TUỘC XÀO SẢ ỚT NHÂM NHI CUỐI TUẦN",
		"THỊT LỢN XÀO TIÊU CAY",
		"MỀ GÀ XÀO CÀ TÍM",
		"THỊT GÀ XÀO DƯA CẢI CHUA",
		"NẤM XÀO TỎI KIỂU MỚI",
		"ĐẬU BẮP XÀO TÉP KHÔ",
		"THỊT BÒ XÀO NGÔ BAO TỬ",
		"ĐẬU PHỤ XÀO CAY ĂN MÃI KHÔNG NGÁN",
		"THỊT BÒ XÀO CỦ ĐẬU",
		"MƯỚP XÀO NẤM GIÒN NGỌT",
		"THỊT BÒ XÀO MĂNG TƯƠI VÀ SU SU",
		"MIẾN XÀO THẬP CẨM DỄ LÀM DỄ ĂN", 
		"NUI GẠO XÀO THỊT BÒ",
		"LƯỠI LỢN XÀO SẢ ỚT",
		"NẤM ĐÙI GÀ XÀO THỊT BÒ", 
		"MĂNG TƯƠI XÀO BÔNG HẸ",
		"MỀ GÀ XÀO DỨA",
		"CÁ RÁN GIÒN XÀO CHUA NGỌT THẬT NGON",
		"ỐC MỠ XÀO SA TẾ",
		"THỊT BÒ XÀO MƯỚP ĐẮNG", 
		//Sum: 22
	};
	
	public static final int IMGMONXAO[] = {
		R.drawable.hinh1,
		R.drawable.hinh2,
		R.drawable.hinh3,
		R.drawable.hinh4,
		R.drawable.hinh5,
		R.drawable.hinh6,
		R.drawable.hinh7,
		R.drawable.hinh8,
		R.drawable.hinh9,
		R.drawable.hinh10,
		R.drawable.hinh11,
		R.drawable.hinh12,
		R.drawable.hinh13,
		R.drawable.hinh14,
		R.drawable.hinh15,
		R.drawable.hinh16,
		R.drawable.hinh17,
		R.drawable.hinh18,
		R.drawable.hinh19,
		R.drawable.hinh20,
		R.drawable.hinh21,
		R.drawable.hinh22,
		//Sum: 22
	};
	
	public static final String MONCANHVACA[] = {
		"CẢI THẢO CUỐN THỊT HẤP", 
		"CANH BÚN",
		"CANH CHUA CÁ LÓC",
		"CANH CHUA MANG CÁ",
		"CANH CHUA MIỀN TÂY",
		"CANH DƯA CHUA NẤU VỚI RAU THÌ LÀ", 
		"CÁNH GÀ RÔTI",
		"CANH HẾN NẤU LÁ RĂM",
		"CANH KHOAI MỠ TÔM THỊT",
		"CANH KHỔ QUA NHỒI CÁ THÁC LÁC",
		"CANH MĂNG HẦM GIÒ HEO",
		"CANH NẤM ĐÔNG CÔ",
		"CANH TRỨNG NẤU NẤM",
		"CẦN TÂY XÀO HẠT ĐIỀU",
		"CÁ BA SA NƯỚNG",
		"CÁ BỐNG CHIÊN GIÒN",
		"CÁ BÔNG LAU KHO HÀNH",
		"CÁ BÔNG LAU KHO TỘ",
		"CÀ BUNG MIỀN BẮC",
		"CÁ CHẺM CHIÊN GIÒN",
		"CÁ CHÉP KHO RIỀNG",
		"CÁ CHÉP NƯỚNG LÒ",
		"CÁ CHIÊN SỐT ME",
		"CÁ ĐUỐI KHO CÀ RI NƯỚC DỪA",
		"CÁ KHO TỘ",
		"CÁ NGỪ KHO RIỀNG",
		"CÀ PHÁO MUỐI DƯA",
		"CÁ TRÊ KHO TIÊU", 
		//Sum: 28
	};
	
	public static final int IMGMONCANHVACA[] = {
		R.drawable.ctcthap,
		R.drawable.cbun,
		R.drawable.cccloc,
		R.drawable.ccmca,
		R.drawable.ccmtay,
		R.drawable.cdcnvtla,
		R.drawable.cgroti,
		R.drawable.chnlram,
		R.drawable.ckmtthit,
		R.drawable.chqnctla,
		R.drawable.cmhgheo,
		R.drawable.cndco,
		R.drawable.ctnnam,
		R.drawable.ctxhdieu,
		R.drawable.cbnuong,
		R.drawable.cbcgion,
		R.drawable.cblkhanh,
		R.drawable.cblkhanh,
		R.drawable.cbmbac,
		R.drawable.cccgion,
		R.drawable.cckrieng,
		R.drawable.ccnlo,
		R.drawable.ccsme,
		R.drawable.cdkcrndua,
		R.drawable.ckto,
		R.drawable.cgkrieng,
		R.drawable.cpmdua,
		R.drawable.ctktieu,
		//Sum: 28
	};
	
	public static final String MONBUN[] = {
		"BÚN BÒ GIÒ HEO",
		"BÚN BÒ HUẾ CHAY",
		"BÚN BÒ HUẾ",
		"BÚN BÒ XÀO",
		"BÚN CÁ LÁT KHO MẲN",
		"BÚN CHẢ CÁ",
		"BÚN CHẢ ĐỒNG XUÂN",
		"BÚN CHẢ HÀ NỘI",
		"BÚN CHẢ NAM ĐỊNH",
		"BÚN GỎI DÀ",
		"BÚN KÈN CÁ",
		"BÚN KIÊN GIANG",
		"BÚN MẲM NƯỚC LÈO",
		"BÚN MĂNG VỊT",
		"BÚN MỌC",
		"BÚN NƯỚC LÈO CÀ MAU",
		"BÚN ỐC",
		"BÚN RIÊU CHAY",
		"BÚN RIÊU",
		"BÚN SUÔNG",
		"BÚN TÀU XÀO LÒNG GÀ",
		"BÚN TÀU XÀO NẤM RƠM",
		"BÚN THANG",
		"BÚN THỊT NƯỚNG",
		"BÚN VỊT XÀO MĂNG",
		"BÚN XÀO CHAY",
		//Sum: 26
	};
	
	public static final int IMGMONBUN[] = {
		R.drawable.bbgheo,
		R.drawable.bbhchay,
		R.drawable.bbhue,
		R.drawable.bbxao,
		R.drawable.bclkman,
		R.drawable.bcca,
		R.drawable.bcdxuan,
		R.drawable.bchnoi,
		R.drawable.bcndinh,
		R.drawable.bggia,
		R.drawable.bkca,
		R.drawable.bkgiang,
		R.drawable.bmnleo,
		R.drawable.bmvit,
		R.drawable.bmoc,
		R.drawable.bnlcmau,
		R.drawable.boc,
		R.drawable.brchay,
		R.drawable.brieu,
		R.drawable.bsuong,
		R.drawable.btxlga,
		R.drawable.btxnrom,
		R.drawable.bthang,
		R.drawable.btnuong,
		R.drawable.bvxmang,
		R.drawable.bxchay,
		//Sum: 26
	};
	
	public static final String MONCHE[] = {
		"CHÈ BÀ BA",
		"CHÈ ĐẬU VÁN",
		"CHÈ HOA CAU BỘT SẮN",
		"CHÈ HOA CAU",
		"CHÈ KHO",
		"CHÈ LONG NHÃN VÀ HẠT SEN",
		"CHÈ SƯƠNG SA HẠT LỰU",
		"CHÈ TÁO XỌN",
		"CHÈ BỘT BÁNG",
		"CHÈ NHA ĐAM TRÀ XANH",
		"CHÈ BẠCH QUẢ ĐU ĐỦ",
		"CHÈ BÍ ĐỎ ĐẬU XANH RAU CÂU",
		"CHÈ ĐẬU ĐỎ BÁNH LỌT",
		"CHÈ BƯỞI ĐẬU XANH",
		"CHÈ BÔNG CAU HUẾ",
		//Sum: 15
	};
	
	public static final int IMGMONCHE[] = {
		R.drawable.cbba,
		R.drawable.cdvan,
		R.drawable.chcbsan,
		R.drawable.chcau,
		R.drawable.ckho,
		R.drawable.clnvhsen,
		R.drawable.csxhluu,
		R.drawable.ctxon,
		R.drawable.cbbang,
		R.drawable.cndtxanh,
		R.drawable.cbqddu,
		R.drawable.cbddxrcau,
		R.drawable.cddblot,
		R.drawable.cbdxanh,
		R.drawable.cbcau,
		//Sum: 15
	};
	
	public static final String MONBOBOCAU[] = {
		"BÊ THUI BÓP THẤU",
		"BÒ BÍA",
		"BỒ CÂU CUỐN MỠ CHÀI",
		"BỒ CÂU QUAY DA GIÒN",
		"BỒ CÂU XÀO LĂN",
		"BỒ CÂU XÂY TỔ",
		"BÒ CUỐN LÁ LỐT", 
		"BÒ CUỐN MỠ CHÀI",
		"BÒ CUỐN PHÔMAI", 
		"BÒ ĐÚT LÒ",
		"BÒ KHO",
		"BÒ LÚC LẮC", 
		"BÒ NƯỚNG LÁ LỐT", 
		"BÒ TÁI CHANH",
		"BÒ XÀO TỨ XUYÊN", 
		"BẮP CẢI NHỒI THỊT",
		"BẦU XÀO TRỨNG VỊT QUAY",
		"BÌ CHAY",
		"BÌ CUỐN CHAY",
		"BÌ ĐỂ ĂN CƠM TẤM",
		"BÔNG CẢI XÀO TÔM CÀNG",
		"BỘT CHIÊN",
		//Sum: 22
	};
	
	public static final int IMGMONBOBOCAU[] = {
		R.drawable.btbthau,
		R.drawable.bbia,
		R.drawable.bccmchai,
		R.drawable.bcqddon,
		R.drawable.bcxlan,
		R.drawable.bcxto,
		R.drawable.bcclnot,
		R.drawable.bcmchai,
		R.drawable.bcpmai,
		R.drawable.bdlo,
		R.drawable.bkho,
		R.drawable.bllac,
		R.drawable.bnlnot,
		R.drawable.btchanh,
		R.drawable.bxtxuyen,
		R.drawable.bcnthit,
		R.drawable.bxtvchay,
		R.drawable.bchay,
		R.drawable.bcchay,
		R.drawable.bdactam,
		R.drawable.bcxtcang,
		R.drawable.bchien,
		//Sum: 22
	};
	
	public static final String MONBANH[] = {
		"BÁNH BAO CHAY",
		"BÁNH BAO LẠT ĂN VỚI THỊT QUAY",
		"BÁNH BAO NGỌT",
		"BÁNH BÈO",
		"BÁNH BÔNG LAN",
		"BÁNH BỘT LỌC THỊT TÔM",
		"BÁNH BỘT LỌC",
		"BÁNH BÒ MẶN",
		"BÁNH BÒ NƯỚNG",
		"BÁNH BÒ TRONG",
		"BÁNH CANH GIÒ HEO",
		"BÁNH CHƯNG",
		"BÁNH CHUỐI NƯỚNG",
		"BÁNH CHUỐI",
		"BÁNH CUỐN TRÁNG CHẢO",
		"BÁNH DÀY KẸP CHẢ",
		"BÁNH DA LỢN",
		"BÁNH FLAN",
		"BÁNH GIÒ NHÂN THỊT",
		"BÁNH ÍT TRẦN",
		"BÁNH KHOAI MÔN",
		"BÁNH KHOÁI",
		"BÁNH KHÚC",
		"BÁNH KHOAI NƯỚNG",
		"BÁNH NẬM",
		"BÁNH PHỤC LINH",
		"BÁNH TÔM HÀ NỘI",
		"BÁNH TRÔI",
		"BÁNH ƯỚT THỊT NƯỚNG",
		"BÁNH XÈO",
		//Sum: 30
	};
	
	public static final int IMGMONBANH[] = {
		R.drawable.bbchay,
		R.drawable.blat,
		R.drawable.bngot,
		R.drawable.bbeo,
		R.drawable.bblan,
		R.drawable.bloctom,
		R.drawable.bbloc,
		R.drawable.bboman,
		R.drawable.bbnuong,
		R.drawable.bbtrong,
		R.drawable.bcgheo,
		R.drawable.btrung,
		R.drawable.bcnuong,
		R.drawable.bchuoi,
		R.drawable.bctchao,
		R.drawable.bdkcha,
		R.drawable.bdlon,
		R.drawable.bflan,
		R.drawable.bgnthit,
		R.drawable.bitran,
		R.drawable.bkmon,
		R.drawable.bkhoai,
		R.drawable.bkhuc,
		R.drawable.bmknuong,
		R.drawable.bnam,
		R.drawable.bplinh,
		R.drawable.bthnoi,
		R.drawable.btroi,
		R.drawable.butnuong,
		R.drawable.bxeo,
		//Sum: 30
	};
	
	public static final String MONGA[] = {
		"GÀ ÁC TIỀM THUỐC BẮC",
		"GÀ CHIÊN TỎI VÀ XÀ LÁCH",
		"GÀ HẤP MUỐI",
		"GÀ KHO SẢ GỪNG", 
		"GÀ NẤU TIÊU NON",
		"GÀ RÔTI", 
		"GÀ RÚT SƯƠNG",
		"GÀ SỐT BIA",
		"GÀ TÂY ĐÚT LÒ", 
		"CUA HẤP BIA",
		"CUA RANG MUỐI ME",
		"CUA RANG MUỐI TÂN BIÊN",
		"DƯA CẢI CHUA", 
		"DƯA GIÁ",
		"DƯA LEO BÓT SỔI",
		"DƯA MÓN",
		"ĐUÔI BÒ HẦM RƯỢU VANG",
		"ẾCH CHIÊN BƠ",
		"ẾCH XÀO LĂN",
		//Sum: 19
	};
	
	public static final int IMGMONGA[] = {
		R.drawable.gattbac,
		R.drawable.gctvxnach,
		R.drawable.ghmuoi,
		R.drawable.gkgung,
		R.drawable.gntnon,
		R.drawable.grti,
		R.drawable.grxuong,
		R.drawable.gsbia,
		R.drawable.gtdlo,
		R.drawable.chbia,
		R.drawable.crmme,
		R.drawable.crmtbien,
		R.drawable.dcchua,
		R.drawable.dgia,
		R.drawable.dlbxoi,
		R.drawable.dmon,
		R.drawable.dbhrvang,
		R.drawable.ecbo,
		R.drawable.exlan,
		//Sum: 19
	};
	
	public static final String MONGOI[] = {
		"GỎI BƯỞI CHAY",
		"GỎI CHÂN GÀ",
		"GỎI CHÂN VỊT",
		"GỎI CỔ HỦ ĐUÔNG DỪA", 
		"GỎI DƯA LEO",
		"GỎI ĐU ĐỦ THÁI LÁT", 
		"GỎI HẾN MANILA", 
		"GỎI LÒNG GÀ", 
		"GỎI MỰC", 
		"GỎI NGÓ SEN", 
		"GỎI SỨA CHAY", 
		"GỎI SỨA", 
		"GỎI TÁO XANH THÁI LAN",
		"GỎI XOÀI XANH", 
		"GỎI XOÀI", 
		//Sum: 15
	};
	
	public static final int IMGMONGOI[] = {
		R.drawable.gbchay,
		R.drawable.gcga,
		R.drawable.gcvit,
		R.drawable.gchddua,
		R.drawable.gdleo,
		R.drawable.gddthai,
		R.drawable.ghmnla,
		R.drawable.glga,
		R.drawable.gmuc,
		R.drawable.gnxen,
		R.drawable.gschay,
		R.drawable.gsua,
		R.drawable.gtxtlan,
		R.drawable.gxxanh,
		R.drawable.gxoai,
		//Sum: 15
	};
	
	public static final String MONTET[] = {
		"LÀM BÁNH CHƯNG GẤC",
		"NEM CHUA BÒ",
		"LÀM KẸO LẠC GIÒN TAN", 
		"LÀM MÌ GÓI CUỘN TRỨNG VỚI THỊT DƯ THỪA",
		"ĂN TẾT VỚI BÁNH TÉT LÁ CẦM",
		"NGÀY TẾT NHẸ NHÀNG VỚI MÓN BÌ CUỐN",
		"CÁCH LÀM GIÒ THỦ",
		"CÁCH NẤU KHỔ QUA HẦM THỊT",
		"THỊT KHO TRỨNG",
		"GIÒ HEO HẦM MĂNG KHÔ",
		"CANH BÓNG THẢ",
		"MIẾN MĂNG", 
		"MUỐI DƯA HÀNH(KIỆU)", 
		"THỊT ĐÔNG",
		"GÀ BÓP RAU RĂM", 
		"CÁCH LÀM MỨT DỪA", 
		"CÁCH LÀM MỨT CÀ RỐT VIÊN TRÒN",
		"CÁCH LÀM MỨT QUẤT DẺO",
		//Sum: 18
	};
	
	public static final int IMGMONTET[] = {
		R.drawable.banhgac,
		R.drawable.nemchua,
		R.drawable.keolac,
		R.drawable.mygoi,
		R.drawable.banhtet,
		R.drawable.bicuon,
		R.drawable.giothu,
		R.drawable.khoqua,
		R.drawable.thitkho,
		R.drawable.heoham,
		R.drawable.bongtha,
		R.drawable.mienmang,
		R.drawable.duahanh,
		R.drawable.thitdong,
		R.drawable.gabop,
		R.drawable.mutdua,
		R.drawable.mutcarot,
		R.drawable.mutquat,
		//Sum: 18
	};
	
	public static final String MONKHAC[] = {
		"HÁ CẢO",
		"HEO HẦM THUỐC BẮC",
		"HOÀNH THÁNH XÁ XÍU", 
		"HỦ TIẾU CHAY", 
		"HỦ TIẾU MỸ THO",
		"HỦ TIẾU NAM VANG",
		"HỦ TIẾU XÀO THỊT BẰM",
		"HỦ TIẾU XÀO TÔM",
		"KHOAI TÂY CHIÊN THỊT BÒ",
		"KIM CHI HÀN QUỐC",
		"KIM CHI VIỆT NAM", 
		"LẨU DÊ",
		"LẨU MẮM",
		"LƯỠI BÒ NẤU GARU",
		"MẮM CHAY",
		"MẮM HUẾ XÀO THỊT", 
		"MẮM NÊM",
		"MẮM RUỐC KHO THỊT", 
		"MIẾN MĂNG CHAY",
		"MIẾN GÀ", 
		"MÌ CĂN DƯA LEO TRỘN GỎI CHAY",
		"MÌ HẢI SẢN",
		"MÌ QUẢNG", 
		"MÌ VỊT TIỀM", 
		"MÌ XÀO GIÒN ĐỒ BIỂN",
		"MÌ XÀO",
		"MỰC XÀO SẢ ỚT",
		"MƯỚT ĐẮNG XÀO THỊT",
		"NEM NƯỚNG",
		"NỘM HOA CHUỐI",
		//Sum: 30
	};
	
	public static final int IMGMONKHAC[] = {
		R.drawable.hcao,
		R.drawable.hhtbac,
		R.drawable.htxxiua,
		R.drawable.htchay,
		R.drawable.htmtho,
		R.drawable.htnvang,
		R.drawable.htxtbam,
		R.drawable.htxtom,
		R.drawable.ktctbo,
		R.drawable.khan,
		R.drawable.kcvnam,
		R.drawable.lde,
		R.drawable.lmam,
		R.drawable.lbngru,
		R.drawable.mchay,
		R.drawable.mhxthit,
		R.drawable.mnem,
		R.drawable.mrkthit,
		R.drawable.mmchay,
		R.drawable.mga,
		R.drawable.mcdleo,
		R.drawable.mhsan,
		R.drawable.mquang,
		R.drawable.mvtiem,
		R.drawable.mxgdbien,
		R.drawable.mxao,
		R.drawable.mxxot,
		R.drawable.mdxthit,
		R.drawable.nnuong,
		R.drawable.nhchuoi,
		//Sum: 30
/**
 * Total: 245
 */
	};
}
