(defproject cascalog/cascalog "1.9.0-wip"
  :source-path "src/clj"
  :java-source-path "src/jvm"
  :jvm-opts ["-Xmx768m" "-server"
             "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n"]
  :javac-options {:debug "true" :fork "true"}
  :repositories {"conjars" "http://conjars.org/repo/"
                 "sonatype"
                 "https://oss.sonatype.org/content/repositories/releases"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [cascading/cascading-hadoop "2.0.0-wip-173"
                  :exclusions [org.codehaus.janino/janino
                               org.apache.hadoop/hadoop-core]]
                 [org.clojure/tools.macro "0.1.1"]
                 [cascading.kryo "0.1.5"]
                 [cascalog/carbonite "1.0.4"]
                 [log4j/log4j "1.2.16"]
                 [hadoop-util "0.2.4"]]
  :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]
                     [lein-multi "1.1.0-SNAPSHOT"]
                     ;; uncomment for doc builds.
                     ;; [backtype/autodoc "0.9.0-SNAPSHOT"]
                     ]
  :autodoc {:name "Cascalog"
            :page-title "Cascalog API Documentation"
            :namespaces-to-document ["cascalog.api" "cascalog.ops"]
            :web-home "http://nathanmarz.github.com/cascalog/"
            :web-src-dir "https://github.com/nathanmarz/cascalog/blob/"}
  :multi-deps {"1.2" [[org.clojure/clojure "1.2.1"]
                      [org.clojure/tools.macro "0.1.1"]
                      [cascading/cascading-hadoop "2.0.0-wip-173"
                       :exclusions [org.codehaus.janino/janino
                                    org.apache.hadoop/hadoop-core]]
                      [cascading.kryo "0.1.5"]
                      [cascalog/carbonite "1.0.3"]
                      [log4j/log4j "1.2.16"]
                      [hadoop-util "0.2.4"]]
               "1.4" [[org.clojure/clojure "1.4.0-alpha2"]
                      [org.clojure/tools.macro "0.1.1"]
                      [cascading/cascading-hadoop "2.0.0-wip-173"
                       :exclusions [org.codehaus.janino/janino
                                    org.apache.hadoop/hadoop-core]]
                      [cascading.kryo "0.1.5"]
                      [cascalog/carbonite "1.0.4"]
                      [log4j/log4j "1.2.16"]
                      [hadoop-util "0.2.4"]]})
