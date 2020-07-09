package no.item.kafka.producer

import java.util.*
import org.apache.kafka.common.serialization.StringSerializer

fun getProperties(): Properties {
  val properties = Properties()
  properties["bootstrap.servers"] = "b-2.enturmockkafkakluster.vl91po.c3.kafka.eu-north-1.amazonaws.com:9094,b-3.enturmockkafkakluster.vl91po.c3.kafka.eu-north-1.amazonaws.com:9094,b-1.enturmockkafkakluster.vl91po.c3.kafka.eu-north-1.amazonaws.com:9094"
  properties["key.serializer"] = StringSerializer::class.java
  properties["value.serializer"] = StringSerializer::class.java
  properties["topic"] = " EnturMockKafka-topic1"
  return properties
}
