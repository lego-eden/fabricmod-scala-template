package legoeden.examplemod

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ExampleMod extends ModInitializer:
	lazy val logger = LoggerFactory.getLogger("ExampleMod")

	override def onInitialize(): Unit =
		logger.info("!!!Hi this is a very long message!!!")