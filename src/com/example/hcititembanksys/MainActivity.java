package com.example.hcititembanksys;

import com.slidingmenu.lib.SlidingMenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView jtx=null;//计算机与通信工程学院
	TextView dzx=null;//电子系
	TextView sxy=null;//商学院
	TextView gjj=null;//国际交流
	TextView jdx=null;//机电系
	TextView qcx=null;//汽车系
	TextView dqx=null;//电气系
	TextView shkx=null;//社会科学。。
	TextView jcb=null;//基础部
	TextView cmx=null;//传媒系
	TextView wdl=null;//未登录
	TextView tc=null;//退出

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); 
        setContentView(R.layout.activity_main);
       init();
    }
  public void init(){
	 SlidingMenu  menu=new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);
        menu.setBehindWidth(600);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setMenu (R.layout.layout_menu) ;
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        jtx=(TextView)findViewById(R.id.jtx);
        dzx=(TextView)findViewById(R.id.dzx);
        sxy=(TextView)findViewById(R.id.sxy);
        dqx=(TextView)findViewById(R.id.dqx);
        qcx=(TextView)findViewById(R.id.qcx);
        jdx=(TextView)findViewById(R.id.jdx);
        jcb=(TextView)findViewById(R.id.jcb);
        wdl=(TextView)findViewById(R.id.wdl);
        tc=(TextView)findViewById(R.id.tc);
        gjj=(TextView)findViewById(R.id.gjj);
        shkx=(TextView)findViewById(R.id.shkx);
        cmx=(TextView)findViewById(R.id.cmx);
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
