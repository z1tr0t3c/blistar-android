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
import android.webkit.CookieManager
import android.webkit.URLUtil
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_vplan1 -> {

                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                myWebView.loadUrl("https://edu.blista.de/moodle/mod/resource/view.php?id=39")

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

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_vplan2 -> {

                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                myWebView.loadUrl("https://edu.blista.de/moodle/mod/resource/view.php?id=41")

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_speis1 -> {

                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/content/speiseplan#page-content")

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_speis2 -> {

                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/speiseplan-vegetarisch#page-content")

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
                myWebView.loadUrl("https://edu.blista.de/moodle/mod/resource/view.php?id=43")

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

                true
            }
            R.id.navigation_vorschau2 -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                myWebView.loadUrl("https://edu.blista.de/moodle/mod/resource/view.php?id=45")
                true
            }
            R.id.navigation_news -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/aktuelles#page-content")
                true
            }
            R.id.navigation_termine -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/content/termine-0#page-content")
                true
            }
            R.id.navigation_ags -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/sport-und-freizeit-angebote#page-content")
                true
            }
            R.id.navigation_ank -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://edu.blista.de/moodle/mod/forum/search.php?id=3&words&phrase&notwords&fullwords&timefromrestrict=1&fromday=1&frommonth=1&fromyear=2000&fromhour=0&fromminute=0&hfromday=0&hfrommonth=0&hfromyear=0&hfromhour=0&hfromminute=0&htoday=1&htomonth=1&htoyear=1&htohour=1&htominute=1&forumid&subject&user#maincontent")
                true
            }
            R.id.navigation_kalender -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://edu.blista.de/moodle/calendar/view.php?view=upcoming#maincontent")
                true
            }
            R.id.navigation_open -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://zitrotec.de/blista-android/opening.html")
                true
            }
            R.id.navigation_katalog -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                myWebView.settings.mediaPlaybackRequiresUserGesture = false
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://katalog.blista.de/allegro")
                if (myWebView.url.contains("dls-katalog")) {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(myWebView.url))
                    startActivity(intent)
                }
                true
            }
            R.id.navigation_edu -> {
                val myPdfUrl = "https://zitrotec.de/blista-android/intranet.pdf"
                val url = "https://docs.google.com/gview?embedded=true&url=$myPdfUrl"
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl(url)
                true
            }
            R.id.navigation_stundenplan -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://zitrotec.de/stundenplan/display.php")
                true
            }
            R.id.navigation_room -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://edu.blista.de/moodle/blocks/mrbs/web/index.php#maincontent")
                true
            }
            R.id.navigation_user -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://edu.blista.de/ldapPortal")
                true
            }
            R.id.navigation_newsletter -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/content/newsletter#page-content")
                true
            }
            R.id.navigation_kontakt -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://www.blista.de/kontakt#page-content")
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
                true
            }

            R.id.navigation_twitter -> {
                val myWebView: WebView = findViewById(R.id.webview)
                myWebView.settings.javaScriptEnabled = true
                webview.webViewClient = WebViewClient()
                Toast.makeText(applicationContext, "Lade Seite...", Toast.LENGTH_LONG).show()
                myWebView.loadUrl("https://twitter.com/blistarapp")
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
