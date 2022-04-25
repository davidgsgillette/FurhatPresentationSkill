package furhatos.app.presentationskill.flow

import furhatos.flow.kotlin.*
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes
import furhatos.util.*
import furhatos.gestures.Gestures
val tictactoeGame: State = state() {


    init {
        furhat.setVoice(Language.ENGLISH_US, Gender.MALE)
        if (users.count > 0) {
            furhat.attend(users.random)
        }
    }


    onEntry {

            furhat.gesture(Gestures.BigSmile)
            furhat.say("Hello, I will be taking over from here."
                    +delay(200)+
            "I am furhat, a social robot designed by furhat robotics in Sweden." +delay(200))

            furhat.say("I was designed for social interactions and social research."
                    +delay(100)+
                    "I can understand and speak many languages and in many voices." +delay(100))
        furhat.setVoice(Language.ENGLISH_AU, Gender.FEMALE)
        furhat.say("for example I can talk like this. " +delay(200)        )


        furhat.setVoice(Language.ENGLISH_GB, Gender.FEMALE)
        furhat.say("or like this." +delay(200))

        furhat.setVoice(Language.JAPANESE, Gender.MALE)
        furhat.say("私もこのように話すことができます" +delay(100))

        furhat.setVoice(Language.ENGLISH_GB, Gender.FEMALE)

        furhat.say("Anyway, enough about my voice lets go to the next slide." +delay(700))

        furhat.say("I can change my face. " +delay(200)+
        "Since my face is actually just a projection on this front mask it can be whatever you want." +delay(200)+
            "This makes it easy to edit, it is constructed in layers so you can even make your own face if you want to by editing individual " +
                "layers like the mouth layer then the eyes layer." +delay(200)+
        "Here are some example faces for your viewing pleasure.")

        furhat.setMask("adult", "Titan")
        furhat.setVoice(Language.ENGLISH_SCT, Gender.MALE)
        furhat.say("I can be a robot." + Gestures.BigSmile +delay(700))

        furhat.setMask("adult", "Isabel")
        furhat.setVoice(Language.ENGLISH_CA, Gender.FEMALE)
        furhat.say("Or I can look more feminine."+ Gestures.Nod +delay(700))

        furhat.setMask("adult", "Brooklyn")
        furhat.setVoice(Language.ENGLISH_NG, Gender.FEMALE)
        furhat.say("or have different skin colors. "+ Gestures.BrowRaise +delay(700))

        furhat.say("As the slide says I have a base camera and speaker down here. " + Gestures.Nod + delay(700))
        furhat.say("Robotics has certainly come very far for me to be able to take this presentation like this. " + Gestures.BigSmile + delay(100))

        furhat.say("thanks for having me but I think I am going to let David and David take over to explain some specifics about their projects." +delay(100))

    }
}

