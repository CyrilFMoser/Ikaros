package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_B, T_B], C]
case class CC_E(a: T_A[(Byte,Int), Char], b: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(_, 12) => 0 
}
}
// This is not matched: (CC_D (CC_E Wildcard Int T_B) Wildcard Wildcard T_B)