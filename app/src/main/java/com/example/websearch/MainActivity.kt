package com.example.websearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var webView: WebView = findViewById(R.id.webView)

        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://www.google.com")


        urlEditText.setOnEditorActionListener { _, actionId, _ ->

            if(actionId == EditorInfo.IME_ACTION_SEARCH){

                webView.loadUrl(urlEditText.text.toString())


                urlEditText.setText(webView.url)

                true

            }else {
                false
            }
        }
    }

}
