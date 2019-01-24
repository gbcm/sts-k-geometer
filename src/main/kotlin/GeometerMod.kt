import basemod.BaseMod
import basemod.interfaces.EditCardsSubscriber
import basemod.interfaces.EditCharactersSubscriber
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer
import com.megacrit.cardcrawl.helpers.CardHelper


@SpireInitializer
class GeometerMod() : EditCharactersSubscriber, EditCardsSubscriber {

    val RESOURCE_PATH = "geometer/"
    val IMG_PATH = RESOURCE_PATH + "img/"
    val BADGE_IMG = IMG_PATH + "BaseModBadge.png"


    private val GEOM_COLOR = CardHelper.getColor(255.0f, 5.0f, 250.0f)

    init {
        BaseMod.subscribe(this)
    }

    override fun receiveEditCards() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun receiveEditCharacters() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}