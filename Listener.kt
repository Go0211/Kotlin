package com.example.android.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class Listener: AppCompatActivity() {
    var number = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //뷰를 activity로 가져오는 방법
        //  1. 직접 가져오기
        //      val textView: TextView = findViewById(R.id.hello)
        //  2. xml을 import해서 사용해기
        //      hello.

        //익명함수
        //  1. 람다
        hello.setOnClickListener{
            Log.d("hello", "hello")
        }

        //  2. 익명함수 방식
        hello.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d("hello", "hello")
            }
        })

        //  3. 이름이 필요힌 경우 (Click)
        val click = object: View.OnClickListener{
            override fun onClick(p0: View?) {
                number += 10
                Log.d("hello", "hello")
                hello.setText("안녕")
                izoneHello.setImageResource(R.drawable.izone)
                Log.d("number", "${number}")
            }
        }
        hello.setOnClickListener(click)

        // 뷰를 조작하는 함수들(예시)
        //  1. setText
        //  2. setImageResource
    }
}