package com.stopaddict.app

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val wv: WebView = findViewById(R.id.webview)
    with(wv.settings) {
      javaScriptEnabled = true
      domStorageEnabled = true
      allowFileAccess = true
      allowContentAccess = true
      allowUniversalAccessFromFileURLs = true
      cacheMode = WebSettings.LOAD_DEFAULT
    }
    wv.webChromeClient = WebChromeClient()
    wv.loadUrl("file:///android_asset/index.html")
  }
}
