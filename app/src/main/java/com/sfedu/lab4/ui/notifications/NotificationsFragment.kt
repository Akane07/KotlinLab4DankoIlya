package com.sfedu.lab4.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.res.stringResource
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sfedu.lab4.R
import com.sfedu.lab4.databinding.FragmentNotificationsBinding
import com.sfedu.lab4.ui.screen.SectionScreen
import com.sfedu.lab4.ui.theme.Lab4Theme

class NotificationsFragment : Fragment() {
    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!
    private val notificationsViewModel: NotificationsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.composeView.setViewCompositionStrategy(
            ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed
        )
        binding.composeView.setContent {
            val text by notificationsViewModel.text.observeAsState("")

            Lab4Theme {
                SectionScreen(
                    title = stringResource(R.string.notifications_title),
                    description = text,
                    note = stringResource(R.string.notifications_note)
                )
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
