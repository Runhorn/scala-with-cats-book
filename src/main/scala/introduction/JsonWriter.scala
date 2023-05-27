package introduction

trait JsonWriter[A] {
  def write(value: A): Json
}
