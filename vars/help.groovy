import me.juliochaves.Help

def call(Map config) {
  node {
    stage('Build') {
      def help = new Help(this)
      help.show()
    }
  }
}
