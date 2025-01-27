package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[D], D]
case class CC_E[H](a: T_A[H, H], b: Char) extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_E(_, 'x') => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard (T_A Char))