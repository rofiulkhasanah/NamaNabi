package com.dicoding.picodiploma.namanamanabi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_item.*

class DetailItemActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_IMAGE_URL = "extra_image_url"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_item)

        showDetailItem()
        val actionBar = supportActionBar
        actionBar!!.title = "DETAIL"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


    private fun showDetailItem() {
        tv_name_detail.setText(intent.getStringExtra(EXTRA_NAME))
        tv_detail.setText(intent.getStringExtra(EXTRA_DETAIL))
        img_detail.setImageResource(intent.getStringExtra(EXTRA_IMAGE_URL).toInt())
    }
}