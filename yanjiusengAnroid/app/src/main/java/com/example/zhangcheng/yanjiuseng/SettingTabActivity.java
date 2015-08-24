package com.example.zhangcheng.yanjiuseng;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class SettingTabActivity extends Activity implements OnItemClickListener{
    
    private com.kingbird.test1.CornerListView cornerListView = null;
    
    private List<Map<String,String>> listData = null;
    private SimpleAdapter adapter = null;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab_setting);
        
        cornerListView = (CornerListView)findViewById(R.id.setting_list);
        setListData();
        
        adapter = new SimpleAdapter(getApplicationContext(), listData, R.layout.main_tab_setting_list_item , new String[]{"text"}, new int[]{R.id.setting_list_item_text});
        cornerListView.setAdapter(adapter);
        cornerListView.setOnItemClickListener(this);
    }
    
    /**
     * �����б����
     */
    private void setListData(){
		listData = new ArrayList<Map<String, String>>();

		Map<String,String> map = new HashMap<String, String>();
        map.put("text", "�û���Ϣ");
        listData.add(map);
        
        map = new HashMap<String, String>();
        map.put("text", "�豸��Ϣ");
        listData.add(map);
        
        map = new HashMap<String, String>();
        map.put("text", "��������");
        listData.add(map);
    }

	@Override
	public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
		switch (position) {
		case 0:
			Toast.makeText(SettingTabActivity.this, "�û���Ϣ", 0).show();
			
			break;
		case 1:
			Toast.makeText(SettingTabActivity.this, "�豸��Ϣ", 0).show();
			
			break;
		case 2:
			Toast.makeText(SettingTabActivity.this, "��������", 0).show();
				
			break;
		default:
			break;
		}
	}
}