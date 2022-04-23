package furhatos.app.presentationskill.flow

import furhatos.flow.kotlin.*
import furhatos.gestures.Gestures
import furhatos.nlu.common.Yes
import furhatos.util.*

val tictactoeGame: State = state() {


    init {
        furhat.setVoice(Language.ENGLISH_US, Gender.MALE)
        if (users.count > 0) {
            furhat.attend(users.random)
        }
    }


    onEntry {
        onResponse<Yes>{
            furhat.gesture(Gestures.BigSmile)
            furhat.say("Hello, I will be taking over from here."
                    +delay(200)+
            "I am a social robot designed by furhat robotics in Sweden." +delay(200))




        }

    }
}

