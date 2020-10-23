package sheridan.paralkar.employeedata2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import sheridan.paralkar.employeedata2.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {
    companion object{
        const val ENVELOPE = "envelope"
    }

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    private var envelope: Envelope? = null


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        if(savedInstanceState is Bundle){
            envelope = savedInstanceState.getSerializable(ENVELOPE) as Envelope?
        }
        showEnvelope()

        return binding.root
    }
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_second, container, false)
//    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        if(envelope != null)
            outState.putSerializable(ENVELOPE, envelope)
    }

    fun receiveEnvelope(envelope: Envelope){
        this.envelope = envelope
        showEnvelope()
    }

    private fun showEnvelope(){

        binding.isTrainedOutput.text =
                when{
                    (envelope?.isTrained == true) -> getString(R.string.trained)
                    (envelope?.isTrained == false) -> getString(R.string.not_trained)
                    else -> getString(R.string.undefined)
                }

        binding.isCertifiedOutput.text =
                when{
                    (envelope?.isCertified == true) -> getString(R.string.certified)
                    (envelope?.isCertified == false) -> getString(R.string.not_certified)
                    else -> getString(R.string.undefined)
                }

        binding.messageText.text =
                envelope?.textMessage ?: getString(R.string.undefined)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnback).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
}