package com.example.example
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import com.example.flutter_sms.FlutterSmsPlugin // Your plugin class

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        FlutterSmsPlugin.registerWith(flutterEngine.dartExecutor.binaryMessenger)
    }
}