package me.juliochaves;

class Help {
  def steps
  Help(steps) {
    this.steps = steps
  }
  def show(String name = "World") {
    steps.echo "Hello ${name}!!!"
  }
}
