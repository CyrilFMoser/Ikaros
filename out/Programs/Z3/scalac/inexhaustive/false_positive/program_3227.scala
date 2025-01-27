package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E, F](a: F, b: T_A[F, E]) extends T_A[E, F]

val v_a: CC_B[Boolean, T_A[((Byte,Byte),T_B), T_B]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))