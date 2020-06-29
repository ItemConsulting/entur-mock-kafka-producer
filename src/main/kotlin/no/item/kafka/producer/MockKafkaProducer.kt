package no.item.kafka.producer

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.lang.Thread.sleep

fun main(args: Array<String>) {
  //MockKafkaProducer().run()
  var i = 1
  while(true){
    println("hei " + i)
    i++
    sleep(500)
  }
}

class MockKafkaProducer {

  private val logger: Logger = LoggerFactory.getLogger(javaClass)

  fun run() {
    logger.info("Application starting")
    val message: String = "message goes here"
    MessageSender().send(message)
  }
}
