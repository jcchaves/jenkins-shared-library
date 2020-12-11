import me.juliochaves.Help

def call(Map config) {
  node {
    stages('Build') {
      def help = new Help(steps)
      help.show()
    }
  }
}
