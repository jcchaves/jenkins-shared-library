def call(Map config = [:]) {
  def name = config.get("name", "World")
  echo "Hello ${name}!!!"
}
