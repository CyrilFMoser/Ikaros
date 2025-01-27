package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E](a: T_B[E], b: T_A[E, E]) extends T_A[E, T_A[Char, Char]]
case class CC_D[G]() extends T_B[G]
case class CC_E[H]() extends T_B[H]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(), _) => 0 
}
}
// This is not matched: (CC_B Byte Boolean (T_A Byte))