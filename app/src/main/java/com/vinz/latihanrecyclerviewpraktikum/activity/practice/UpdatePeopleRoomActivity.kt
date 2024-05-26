package com.vinz.latihanrecyclerviewpraktikum.activity.practice

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.esafirm.imagepicker.features.ImagePickerConfig
import com.esafirm.imagepicker.features.ImagePickerMode
import com.esafirm.imagepicker.features.ReturnMode
import com.esafirm.imagepicker.features.registerImagePicker
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.vinz.latihanrecyclerviewpraktikum.R
import com.vinz.latihanrecyclerviewpraktikum.room.practice.PeopleEntity
import com.vinz.latihanrecyclerviewpraktikum.room.practice.PeopleViewModel
import com.vinz.latihanrecyclerviewpraktikum.room.practice.PeopleViewModelFactory
import com.vinz.latihanrecyclerviewpraktikum.utils.reduceFileImage
import com.vinz.latihanrecyclerviewpraktikum.utils.uriToFile
import java.io.File

class UpdatePeopleRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_people_room)
    }
}