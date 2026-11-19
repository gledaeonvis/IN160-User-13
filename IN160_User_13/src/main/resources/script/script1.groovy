package script

import com.sap.gateway.ip.core.customdev.util.Message

def Message processData(Message message) {

    // Set the payload and return.
    message.setBody("Payload set in the Visual Studio Code")
    return message

}