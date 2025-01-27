package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Char, b: T_B[C]) extends T_A[C]
case class CC_D[F]() extends T_B[F]
case class CC_E[G]() extends T_B[G]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D()) => 0 
}
}
// This is not matched: (CC_A Int Byte Wildcard Wildcard Wildcard (T_A Int Byte))