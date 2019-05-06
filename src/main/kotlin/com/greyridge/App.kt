package com.greyridge

import org.jooby.*
import org.jooby.assets.Assets

class App: Kooby({
  use(Assets())
  get {
    var env = this.require(Env::class)

    """
      <html>
      <head>
      <link rel="stylesheet" href="${this.get<List<String>>("home_css").first()}"></link>
      </head>
      <body>
      hello world with assets
      ${env.name()}
      </body>
      </html>
    """.trimIndent()
  }
})

fun main(args: Array<String>) {
  run(::App, *args)
}