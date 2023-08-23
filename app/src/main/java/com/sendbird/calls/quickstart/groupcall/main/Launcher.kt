package com.sendbird.calls.quickstart.groupcall.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.sendbird.calls.quickstart.groupcall.R
import com.sendbird.calls.quickstart.groupcall.databinding.ActivityLauncherBinding
import com.sendbird.calls.quickstart.groupcall.databinding.ActivitySignInBinding
import com.sendbird.calls.quickstart.groupcall.signin.AuthenticateViewModel
import com.sendbird.calls.quickstart.groupcall.signin.SignInActivity
import com.sendbird.calls.quickstart.groupcall.util.BaseActivity

class Launcher : BaseActivity() {
    private lateinit var binding: ActivityLauncherBinding
    private val viewModel: AuthenticateViewModel = AuthenticateViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_launcher)

        binding.createRoomBtn.setOnClickListener(this::goToMainActivity)
        binding.BrowseCourseBtn.setOnClickListener(this::goTobROWSEActivity)
    }

    private fun goToMainActivity(v: View) {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
    private fun goTobROWSEActivity(v: View) {
        val intent = Intent(this, BrowseCourses::class.java)
        startActivity(intent)
        finish()
    }
}