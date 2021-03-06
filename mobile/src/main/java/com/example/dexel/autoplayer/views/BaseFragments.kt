package com.example.dexel.autoplayer.views

import android.os.Bundle
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.dexel.autoplayer.viewModels.MusicServiceViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseMusicFragment: DaggerFragment(){
    companion object {
        val TAG = BaseMusicFragment::class.java.simpleName
    }
    @Inject
    internal lateinit var factory: ViewModelProvider.Factory

    protected val viewModel by activityViewModels<MusicServiceViewModel> {factory}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }
}
