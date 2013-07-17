package com.example.sample;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
  private WebView webview = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	
    	
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        this.webview = new WebView(this);
        
        
        
        
        this.webview.getSettings().setJavaScriptEnabled(true); 
        this.webview.loadUrl("http://192.168.0.3/svn/caipu/"); 
        
        
        this.webview.setWebViewClient(new WebViewClient() {   
            
	        public boolean shouldOverrideUrlLoading(WebView view, String url) {              
	            view.loadUrl(url);   
	            return true;       
	        }      
        });
        
        
        
        setContentView(this.webview);
        
        
    }
    public boolean onKeyDown(int keyCoder,KeyEvent event){
	        if(this.webview.canGoBack() && keyCoder == KeyEvent.KEYCODE_BACK){
	                this.webview.goBack();   //goBack()表示返回webView的上一页面
	
	                return true;
	        }
	        return false;
	}

    
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}



    
    


