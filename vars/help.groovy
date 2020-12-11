import me.juliochaves.Help

def call(Map config) {
  def name = config.get("name", "World")
  def help = new Help(this)
  help.show(name)
}
