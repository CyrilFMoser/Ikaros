package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[D, D], b: T_B, c: C) extends T_A[C, (T_B,T_A[T_B, T_B])]
case class CC_B[E](a: T_A[E, E], b: Byte, c: E) extends T_A[E, (T_B,T_A[T_B, T_B])]
case class CC_C[F](a: CC_A[F, F], b: F) extends T_A[F, (T_B,T_A[T_B, T_B])]
case class CC_D(a: CC_A[CC_B[T_B], CC_C[T_B]], b: Boolean, c: CC_A[CC_A[Boolean, (Char,Boolean)], CC_C[(Boolean,Byte)]]) extends T_B
case class CC_E(a: T_B, b: T_A[Int, T_A[CC_D, Boolean]], c: CC_D) extends T_B

val v_a: T_A[Boolean, (T_B,T_A[T_B, T_B])] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _, _), _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, _, _), _) => 2 
}
}
// This is not matched: CC_A(_, CC_E(_, _, _), _)