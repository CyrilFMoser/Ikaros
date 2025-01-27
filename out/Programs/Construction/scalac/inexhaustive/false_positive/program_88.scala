package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_C[E, F]() extends T_B[E, F]
case class CC_D[G, H]() extends T_B[G, H]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
}
}
// This is not matched: CC_C(_, CC_B(_), CC_A(CC_D(_, _, _)))