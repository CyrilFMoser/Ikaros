package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int) extends T_A[T_A[Int, T_B], (Byte,T_B)]
case class CC_B(a: T_A[T_A[Int, T_B], (Byte,T_B)], b: T_A[Byte, T_B]) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}