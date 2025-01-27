package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: (T_B[CC_A, T_A],T_A), b: T_B[Boolean, T_A]) extends T_A
case class CC_C(a: CC_A, b: Byte, c: Byte) extends T_A
case class CC_D[C](a: C, b: Char) extends T_B[CC_B, C]
case class CC_E[D, E](a: T_A, b: T_B[CC_B, E], c: CC_C) extends T_B[CC_B, D]
case class CC_F[F](a: F) extends T_B[CC_B, F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(_, CC_A(_, _)), _, _) => 1 
  case CC_C(CC_A(_, CC_B(_, _)), _, _) => 2 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, _) => 3 
}
}
// This is not matched: CC_A(_, _)