package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: E) extends T_A[E, F]
case class CC_C[H]() extends T_B[CC_A[H, H], H]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard (CC_A T_A Boolean Wildcard T_A) T_A)