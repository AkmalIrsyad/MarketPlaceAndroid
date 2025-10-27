package com.gogoro.marketplace.ui.login

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.gogoro.marketplace.R
import com.gogoro.marketplace.databinding.ActivityLoginBinding
import com.gogoro.marketplace.util.Prefs
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val viewModel : LoginViewModel by viewModel()

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

//        Prefs(this)

        setData()
        }

    fun testing(){
        val s = Prefs(this)
        if (s.getIsLogin()){
            binding.tvStatus.text = "Sudah Login"
        }else binding.tvStatus.text = "Belum Login"

        binding.btnLogin.setOnClickListener{
            s.setIsLogin(true)
            onBackPressed()
        }
        binding.btnLogout.setOnClickListener {
            s.setIsLogin(false)
            onBackPressed()
        }

        Log.d("RESPOM","PESAN SINGKAT")
    }

    fun setData(){
        viewModel.text.observe(this,{
            binding.edtEmail.setText(it)
        })
        binding.btnMasuk.setOnClickListener {
            viewModel.ubahData()
        }
        }
    }

