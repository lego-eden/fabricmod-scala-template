# A template for creating a minecraft mod using Scala
This repository contains a skeleton for creating Minecraft mods
with scala instead of Java or Kotlin. This project utilizes a
fork of the official [fabric language scala](https://github.com/FabricMC/fabric-language-scala) mod called [krysztal language scala](https://github.com/Krysztal112233/krysztal-language-scala). The original mod is
unmaintained, but if it ever gets updated this project will
implement that one instead.

# Getting started
Clone this repo using `git clone https://github.com/lego-eden/fabricmod-scala-template.git`
and navigate into it. in order to get the best development experience, run `./gradlew genSources`,
and `./gradlew vscode`. The second command is only necessary if you are using vscode.

You also want to install JDK 21 or JDK 17. If you are developing a mod for minecraft 1.21 or later
use JDK 21, otherwise use JDK 17. You also want to install Scala 3.3.3.

To use Scala with vscode I also recommend installing [Scala Metals](https://marketplace.visualstudio.com/items?itemName=scalameta.metals).
I have experienced issues with having Metals active at the same time as the
[Java extension pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack).
If you are experiencing issues with autocomplete not working or any other mysterious problem
with vscode, then try disabling everything except for Metals.

If you are new to modding or simply want a refresher then I suggest reading the [Fabric modding tutorial](https://docs.fabricmc.net/develop/getting-started/introduction-to-fabric-and-modding). If you are new to Scala I suggest reading the [Scala book](https://docs.scala-lang.org/scala3/book/introduction.html).