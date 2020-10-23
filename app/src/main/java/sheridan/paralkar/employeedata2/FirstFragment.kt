package sheridan.paralkar.employeedata2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import sheridan.paralkar.employeedata2.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    interface InputListener {
        fun send(envelope: Envelope)
    }
    private var inputListener: InputListener? = null

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

    binding.btnSubmit.setOnClickListener { send() }

    return binding.root
}

override fun onAttach(context: Context) {
    super.onAttach(context)
    inputListener = context as InputListener?;
}

override fun onDetach() {
    super.onDetach()
    inputListener = null
}
    private fun send(){
        // get urgent flag value
        val isTrained: Boolean = binding.chkTrained.isChecked
        val isCertified: Boolean = binding.chkCertified.isChecked
        // get the selected message text

    }
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        view.findViewById<Button>(R.id.btnSubmit).setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
//    }
}