package me.juliochaves;

class Help {
  def steps
  Help(steps) {
    this.steps = steps
  }
  def show() {
    steps.echo "How to use me?"
  }
}
