package net.pikanji.webviewsample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	private WebView mWebView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mWebView = (WebView)findViewById(R.id.webView1);

//		mWebView.setWebViewClient(new WebViewClient());

		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.getSettings().setUserAgentString("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.17 (KHTML, like Gecko) Chrome/24.0.1312.52 Safari/537.17");

//		mWebView.loadUrl("http://kurotofu.sytes.net/test/test.html");
		
		mWebView.loadUrl("file:///android_asset/simple.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.menu_google_images:
	    		mWebView.loadUrl("https://www.google.com/search?q=%E3%81%8A%E3%82%82%E3%81%97%E3%82%8D%E3%80%80%E7%8A%AC&hl=ja&tbo=d&source=lnms&tbm=isch&sa=X&ei=_rD-UJS5NOma0QXSvIGADQ&ved=0CAoQ_AUoAA&biw=1276&bih=683");
	            return true;
	        case R.id.menu_simple_html:
	        	mWebView.loadUrl("file:///android_asset/simple.html");
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
}
