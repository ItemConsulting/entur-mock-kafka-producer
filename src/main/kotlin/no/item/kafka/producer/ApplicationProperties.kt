package no.item.kafka.producer

import java.util.*
import org.apache.kafka.common.serialization.StringSerializer

fun getProperties(): Properties {
  val properties = Properties()
  properties["bootstrap.servers"] = "b-1.kafkatestcluster.lgg7tc.c3.kafka.eu-north-1.amazonaws.com:9094,b-2.kafkatestcluster.lgg7tc.c3.kafka.eu-north-1.amazonaws.com:9094,b-3.kafkatestcluster.lgg7tc.c3.kafka.eu-north-1.amazonaws.com:9094"
  properties["key.serializer"] = StringSerializer::class.java
  properties["value.serializer"] = StringSerializer::class.java
  properties["topic"] = "EnturMockKafka-topic1"
  properties["security.protocol"] = "SSL"
  return properties
}
