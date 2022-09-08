package com.example.gd3_c_0573

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentContainer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_c_0573.entity.Mahasiswa

class FragmentMahasiswa : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View?{
        return inflater.inflate(R.layout.activity_fragment_mahasiswa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        val adapter: RVMahasiswaAdapter = RVMahasiswaAdapter(Mahasiswa.listOfMahasiswa)

        val rvMahasiswa : RecyclerView = view.findViewById(R.id.rv_mahasiswa)

        rvMahasiswa.layoutManager = layoutManager

        rvMahasiswa.setHasFixedSize(true)

        rvMahasiswa.adapter= adapter
    }


}