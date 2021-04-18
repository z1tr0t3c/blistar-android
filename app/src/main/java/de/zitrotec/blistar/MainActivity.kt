/*
 * Copyright (c) 2019 Falk Rismansanj. All rights reserved.
 */

package de.zitrotec.blistar

import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.os.Build
import android.webkit.*


class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_vplan1 -> {

                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                myWebView.loadUrl("https://css.moodle.blista.study/mod/resource/view.php?id=39")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_vplan2 -> {

                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                myWebView.loadUrl("https://css.moodle.blista.study/mod/resource/view.php?id=41")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_speis1 -> {

                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/content/speiseplan#page-content")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_speis2 -> {

                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/speiseplan-vegetarisch#page-content")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection

        return when (item.itemId) {
            R.id.navigation_vorschau1 -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                myWebView.loadUrl("https://css.moodle.blista.study/mod/resource/view.php?id=43")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_vorschau2 -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                myWebView.loadUrl("https://css.moodle.blista.study/mod/resource/view.php?id=45")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_news -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/aktuelles#page-content")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_termine -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/content/termine-0#page-content")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_ags -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/sport-und-freizeit-angebote#page-content")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_ank -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://css.moodle.blista.study/mod/forum/search.php?id=3&words&phrase&notwords&fullwords&timefromrestrict=1&fromday=1&frommonth=1&fromyear=2000&fromhour=0&fromminute=0&hfromday=0&hfrommonth=0&hfromyear=0&hfromhour=0&hfromminute=0&htoday=1&htomonth=1&htoyear=1&htohour=1&htominute=1&forumid&subject&user#maincontent")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })
                true
            }
            R.id.navigation_kalender -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://css.moodle.blista.study/calendar/view.php?view=upcoming#maincontent")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_open -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://zitrotec.de/blista-android/opening.html")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_katalog -> {
                    val myWebView: WebView = findViewById(R.id.webview)
                    myWebView.settings.javaScriptEnabled = true
                    myWebView.settings.mediaPlaybackRequiresUserGesture = false
                    webview.webViewClient = WebViewClient()
                myWebView.webChromeClient = WebChromeClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                    myWebView.loadUrl("https://katalog.blista.de/")
                    if (myWebView.url.contains("blibu-katalog")) {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(myWebView.url))
                        startActivity(intent)
                    }

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }

                    }

                })

                true
            }
            R.id.navigation_edu -> {
                val url = "https://edu.blista.de/webfolders"
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl(url)

                myWebView.setWebChromeClient(object : WebChromeClient() {
                    override fun onJsAlert(view: WebView, url: String, message: String, result: JsResult): Boolean {
                        return super.onJsAlert(view, url, message, result)
                    }
                })

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_stundenplan -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://zitrotec.de/stundenplan/display.php")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_room -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://css.moodle.blista.study/blocks/mrbs/web/index.php#maincontent")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_user -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://edu.blista.de/ldapPortal")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_newsletter -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/ihr-weg-zu-uns#Ko")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_kontakt -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/kontakt#page-content")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }
            R.id.navigation_weg -> {
                val myPdfUrl = "https://zitrotec.de/blista-android/wegbeschreibung.pdf"
                val url = "https://docs.google.com/gview?embedded=true&url=$myPdfUrl"
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl(url)

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }

            R.id.navigation_ferien -> {
                val myPdfUrl = "https://zitrotec.de/blista-android/ferienordnung.pdf"
                val url = "https://docs.google.com/gview?embedded=true&url=$myPdfUrl"
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl(url)

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }

            R.id.navigation_terminplan -> {
                val myPdfUrl = "https://zitrotec.de/blista-android/terminplan.pdf"
                val url = "https://docs.google.com/gview?embedded=true&url=$myPdfUrl"
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl(url)

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }

            R.id.navigation_about -> {

                val pinfo = packageManager.getPackageInfo(packageName, 0)
                val versionName = pinfo.versionName
                val MyUA = "blistar/" + versionName
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                myWebView.getSettings().setUserAgentString(MyUA)
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://zitrotec.de/blista-android")

                myWebView.setWebChromeClient(object : WebChromeClient() {
                    override fun onJsAlert(view: WebView, url: String, message: String, result: JsResult): Boolean {
                        return super.onJsAlert(view, url, message, result)
                    }
                })

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("sms:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("market:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("amzn:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        }
                        else {
                            return false
                        }
                    }
                })

                true
            }

            R.id.navigation_twitter -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://mobile.twitter.com/blistarapp")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }

            R.id.navigation_meet -> {

                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://zitrotec.de/blista/meet.html")
                startActivity(openURL)

                true
            }

            R.id.navigation_corona -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                myWebView.loadUrl("https://zitrotec.de/blista-android/corona.html")

                webview.setDownloadListener({ url, userAgent, contentDisposition, mimeType, contentLength ->
                    val request = DownloadManager.Request(Uri.parse(url))
                    request.setMimeType(mimeType)
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(url))
                    request.addRequestHeader("User-Agent", userAgent)
                    request.setDescription("Downloading file...")
                    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType))
                    request.allowScanningByMediaScanner()
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    request.setDestinationInExternalFilesDir(this@MainActivity, Environment.DIRECTORY_DOWNLOADS, ".png")
                    val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                    dm.enqueue(request)
                    Toast.makeText(applicationContext, "Lade Datei...", Toast.LENGTH_LONG).show()
                })

                myWebView.setWebViewClient(object : WebViewClient() {
                    override fun shouldOverrideUrlLoading(view: WebView, url: String?): Boolean {
                        if (url != null && url.startsWith("mailto:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else if (url != null && url.startsWith("tel:")) {
                            view.context.startActivity(
                                Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            )
                            return true
                        } else {
                            return false
                        }
                    }
                })

                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.nav, menu)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
}
