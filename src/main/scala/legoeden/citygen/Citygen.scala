package legoeden.citygen

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object Citygen extends ModInitializer:
	lazy val logger = LoggerFactory.getLogger("KMMO")

	override def onInitialize(): Unit =
		logger.info("Hi")