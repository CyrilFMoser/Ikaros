package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Byte,Int)]]

val v_a: T_A[T_A[(Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}