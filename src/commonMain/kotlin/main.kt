import korlibs.event.*
import korlibs.image.color.*
import korlibs.korge.*
import korlibs.korge.input.*
import korlibs.korge.scene.*
import korlibs.korge.view.*


suspend fun main() = Korge(
    fullscreen = true,
    backgroundColor = Colors["#2b2b2b"],
) {
    val sceneContainer = sceneContainer()

    sceneContainer.changeTo { MyScene() }
}

class MyScene : Scene() {
    override suspend fun SContainer.sceneMain() {
        keys {
            down(Key.F) { gameWindow.fullscreen = !gameWindow.fullscreen }
        }
    }
}
