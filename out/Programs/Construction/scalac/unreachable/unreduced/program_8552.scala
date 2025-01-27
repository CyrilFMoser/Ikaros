package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, T_B]]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[D, T_A[D, T_B]]

val v_a: T_A[Boolean, T_A[Boolean, T_B]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(true, _) => 1 
  case CC_B(false, _) => 2 
}
}