package com.skyview.nupcoemployeeapp

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener { showDoneDialog() }

    }

    private fun showDoneDialog() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.verification_code)
        dialog.show()
        dialog.window!!.setLayout(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.WHITE))
        dialog.window!!.attributes.windowAnimations = R.style.dialogAnimation
        dialog.window!!.setGravity(Gravity.CENTER)
        dialog.window!!.setBackgroundDrawableResource(R.drawable.alertbg)
    }
}
