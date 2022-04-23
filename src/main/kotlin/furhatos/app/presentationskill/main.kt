package furhatos.app.presentationskill

import furhatos.app.presentationskill.flow.*
import furhatos.skills.Skill
import furhatos.flow.kotlin.*

class PresentationskillSkill : Skill() {
    override fun start() {
        Flow().run(Idle)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
