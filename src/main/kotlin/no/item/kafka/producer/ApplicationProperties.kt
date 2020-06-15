package no.item.kafka.producer

import java.util.*
import org.apache.kafka.common.serialization.StringSerializer

fun getProperties(): Properties {
  val properties = Properties()
  properties["bootstrap.servers"] = ""
  properties["key.serializer"] = StringSerializer::class.java
  properties["value.serializer"] = StringSerializer::class.java
  properties["topic"] = "kafka-event"
  return properties
}
