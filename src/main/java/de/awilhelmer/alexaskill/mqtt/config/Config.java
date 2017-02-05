package de.awilhelmer.alexaskill.mqtt.config;
// generated by tscfg 0.8.0 on Sun Feb 05 21:53:00 CET 2017
// source: config.conf

public class Config {
   public final Config.Mqtt_skill mqtt_skill;

   public static class Mqtt_skill {
      public final Mqtt_skill.Commands commands;
      public final Mqtt_skill.Devices devices;
      public final Mqtt_skill.Mqtt_host mqtt_host;

      public static class Commands {
         public final java.util.List<Commands.List$Elm> list;

         public static class List$Elm {
            public final java.lang.String command;
            public final java.lang.String mqtt_command;

            public List$Elm(com.typesafe.config.Config c) {
               this.command = c.hasPathOrNull("command") ? c.getString("command") : "on";
               this.mqtt_command = c.hasPathOrNull("mqtt-command") ? c.getString("mqtt-command") : "power:1";
            }
         }

         public Commands(com.typesafe.config.Config c) {
            this.list = $_LCommands_List$Elm(c.getList("list"));
         }

         private static java.util.List<Commands.List$Elm> $_LCommands_List$Elm(com.typesafe.config.ConfigList cl) {
            java.util.ArrayList<Commands.List$Elm> al = new java.util.ArrayList<>();
            for (com.typesafe.config.ConfigValue cv : cl) {
               al.add(new Commands.List$Elm(((com.typesafe.config.ConfigObject) cv).toConfig()));
            }
            return java.util.Collections.unmodifiableList(al);
         }
      }

      public static class Devices {
         public final java.util.List<Devices.List$Elm2> list;

         public static class List$Elm2 {
            public final java.lang.String name;
            public final java.lang.String topic;
            public final java.lang.String type;

            public List$Elm2(com.typesafe.config.Config c) {
               this.name = c.hasPathOrNull("name") ? c.getString("name") : "kitchen light";
               this.topic = c.hasPathOrNull("topic") ? c.getString("topic") : "kueche_led";
               this.type = c.hasPathOrNull("type") ? c.getString("type") : "LED";
            }
         }

         public Devices(com.typesafe.config.Config c) {
            this.list = $_LDevices_List$Elm2(c.getList("list"));
         }

         private static java.util.List<Devices.List$Elm2> $_LDevices_List$Elm2(com.typesafe.config.ConfigList cl) {
            java.util.ArrayList<Devices.List$Elm2> al = new java.util.ArrayList<>();
            for (com.typesafe.config.ConfigValue cv : cl) {
               al.add(new Devices.List$Elm2(((com.typesafe.config.ConfigObject) cv).toConfig()));
            }
            return java.util.Collections.unmodifiableList(al);
         }
      }

      public static class Mqtt_host {
         public final java.lang.String hostname;
         public final java.lang.String password;
         public final int port;
         public final java.lang.String username;

         public Mqtt_host(com.typesafe.config.Config c) {
            this.hostname = c.hasPathOrNull("hostname") ? c.getString("hostname") : "";
            this.password = c.hasPathOrNull("password") ? c.getString("password") : "";
            this.port = c.hasPathOrNull("port") ? c.getInt("port") : 8883;
            this.username = c.hasPathOrNull("username") ? c.getString("username") : "";
         }
      }

      public Mqtt_skill(com.typesafe.config.Config c) {
         this.commands = new Mqtt_skill.Commands(c.getConfig("commands"));
         this.devices = new Mqtt_skill.Devices(c.getConfig("devices"));
         this.mqtt_host = new Mqtt_skill.Mqtt_host(c.getConfig("mqtt-host"));
      }
   }

   public Config(com.typesafe.config.Config c) {
      this.mqtt_skill = new Config.Mqtt_skill(c.getConfig("mqtt-skill"));
   }
}
      