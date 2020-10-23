package sheridan.paralkar.employeedata2

import java.io.Serializable

data class Envelope(val isTrained: Boolean,val isCertified: Boolean, val textMessage: String): Serializable