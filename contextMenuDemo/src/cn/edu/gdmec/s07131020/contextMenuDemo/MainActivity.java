package cn.edu.gdmec.s07131020.contextMenuDemo;

import cn.edu.gdmec.s07131020.MenuDemo.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	final static int CONTEXT_MENU_1 = Menu.FIRST;
    final static int CONTEXT_MENU_2 = Menu.FIRST+1;
    final static int CONTEXT_MENU_3 = Menu.FIRST+2;

   TextView mytv;
   EditText myet;
   
   
    @Override
public boolean onContextItemSelected(MenuItem item) {
	// TODO Auto-generated method stub
    	
	mytv.setText("选择了快捷菜单"+item.getTitle());
	switch(item.getItemId()){
	case CONTEXT_MENU_1:
    myet.setText("你点击了"+item.getTitle());
    break;
	case  CONTEXT_MENU_2:
		myet.setText("你点击了"+item.getTitle());
		break;
	case  CONTEXT_MENU_3:
		myet.setText("你点击了"+item.getTitle());
		break;
    }
	return super.onContextItemSelected(item);
}


@Override
public void onCreateContextMenu(ContextMenu menu, View v,
		ContextMenuInfo menuInfo) {
	// TODO Auto-generated method stub
	menu.setHeaderTitle("快捷菜单标题");

	menu.add(0, CONTEXT_MENU_1, 0,"菜单子项1");
    menu.add(0, CONTEXT_MENU_2, 1,"菜单子项2");
    menu.add(0, CONTEXT_MENU_3, 2,"菜单子项3");

	super.onCreateContextMenu(menu, v, menuInfo);
}


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytv=(TextView)findViewById(R.id.textView1);
        myet=(EditText) findViewById(R.id.editText1);
        registerForContextMenu(mytv);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
