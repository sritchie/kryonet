(defproject com.twitter/kryonet "1.0.4"
  :java-source-path "src"
  :jvm-opts ["-Xmx768m" "-server"]
  :junit [["classes"]]
  :junit-options {:fork "off" :haltonfailure "on"}
  :javac-source-path [["src"] ["test"]]
  :dependencies [[com.googlecode/kryo "1.04"]]
  :dev-dependencies [[junit "4.7"]
                     [lein-javac "1.3.0"]
                     [lein-junit "1.0.0"]])
