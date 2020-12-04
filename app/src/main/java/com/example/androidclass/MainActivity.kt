package com.example.androidclass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*


const val userName = "admin"
const val password = "1"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Glide.with(this).load("https://pic.17qq.com/uploads/piojjpiobz.jpeg").into(iv_main)
//        button.setOnClickListener {
//            val intent = Intent(this,MainActivity2::class.java)
//            startActivity(intent)
//        }

//        setSupportActionBar(tb_main)
//        supportActionBar?.setLogo(R.drawable.ic_drawer_home)
//        supportActionBar?.title = "ToolbarDemo"
//        tb_main.setTitleTextColor(Color.WHITE)
//        tb_main.subtitle = "Android基础"
//        tb_main.setTitleTextColor(Color.WHITE)
//        tb_main.setNavigationIcon(R.drawable.ic_search)

    }
//    private fun showDialog(){
//        val waitingDialog = ProgressDialog(this@MainActivity)
//        waitingDialog.setTitle("等待")
//        waitingDialog.setMessage("正在加载...")
//        waitingDialog.isIndeterminate = true
//        waitingDialog.setCancelable(false)
//        waitingDialog.show()
//    }
//
//    private fun showDialog2(){
//        val MAX_PROGRESS = 100
//        val progressDialog = ProgressDialog(this@MainActivity)
//        progressDialog.progress = 0
//        progressDialog.setTitle("数据加载中，请稍候")
//        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
//        progressDialog.max = MAX_PROGRESS
//        progressDialog.show()
//        Thread{
//            var progress = 0
//            while (progress < MAX_PROGRESS) {
//                try {
//                    Thread.sleep(10)
//                    progress++
//                    progressDialog.progress = progress
//                } catch (e: InterruptedException) {
//                    e.printStackTrace()
//                }
//            }
//            progressDialog.cancel()
//        }.start()
//    }


}