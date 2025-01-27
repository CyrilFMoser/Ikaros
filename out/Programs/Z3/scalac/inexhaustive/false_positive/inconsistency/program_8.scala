package Program_31 

object Test {
sealed trait T_A[B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[Byte]) extends T_A[T_A[E]]
case class CC_C[H, G](a: CC_A[H]) extends T_B[H, G]

val v_a: T_B[Char, (Boolean,Boolean)] = null
val v_b: Int = v_a match{
  case CC_C(CC_A('x', _)) => 0 
}
}
// This is not matched: (CC_C Char (Tuple Boolean Boolean) Wildcard (T_B Char (Tuple Boolean Boolean)))