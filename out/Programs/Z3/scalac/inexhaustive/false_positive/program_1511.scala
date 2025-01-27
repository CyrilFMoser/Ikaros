package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B(a: T_B[Char], b: T_A[Boolean, Byte]) extends T_A[T_A[Char, Char], T_A[T_A[Char, Char], T_A[Char, Char]]]
case class CC_C[F]() extends T_B[F]
case class CC_D[G]() extends T_B[G]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_C(), _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)