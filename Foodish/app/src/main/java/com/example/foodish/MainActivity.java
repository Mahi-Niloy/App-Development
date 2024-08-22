package com.example.foodish;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    WebView wView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Handle window insets for full-screen layout adjustments
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize WebView and load the URL
        wView = findViewById(R.id.wView);
        wView.getSettings().setJavaScriptEnabled(true);
        wView.setWebViewClient(new WebViewClient());
        wView.loadUrl("https://foodishbd.com");
    }

    // Override the onBackPressed method to handle back button behavior in WebView
    @Override
    public void onBackPressed() {
        if (wView.canGoBack()) {
            wView.goBack(); // Go back to the previous page in WebView
        } else {
            super.onBackPressed(); // Exit the app if there's no page to go back to
        }
    }
}
