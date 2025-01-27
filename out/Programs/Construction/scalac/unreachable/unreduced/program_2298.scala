package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Boolean], (Byte,Char)], b: T_A[T_A[Boolean]]) extends T_A[((Int,Byte),T_B[Byte, Int])]
case class CC_B[D](a: T_B[D, D]) extends T_A[((Int,Byte),T_B[Byte, Int])]
case class CC_C(a: CC_A, b: CC_A, c: Boolean) extends T_A[((Int,Byte),T_B[Byte, Int])]
case class CC_D[E, F](a: T_B[E, E], b: Boolean, c: T_B[T_A[F], E]) extends T_B[E, F]
case class CC_E[H, G](a: CC_A, b: CC_B[G], c: CC_D[H, G]) extends T_B[H, G]

val v_a: T_A[((Int,Byte),T_B[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_D(_, _, _), true, CC_D(_, _, _)), _) => 0 
  case CC_A(CC_D(CC_D(_, _, _), true, CC_E(_, _, _)), _) => 1 
  case CC_A(CC_D(CC_E(_, _, _), true, CC_D(_, _, _)), _) => 2 
  case CC_A(CC_D(CC_E(_, _, _), true, CC_E(_, _, _)), _) => 3 
  case CC_A(CC_D(CC_D(_, _, _), false, CC_D(_, _, _)), _) => 4 
  case CC_A(CC_D(CC_D(_, _, _), false, CC_E(_, _, _)), _) => 5 
  case CC_A(CC_D(CC_E(_, _, _), false, CC_D(_, _, _)), _) => 6 
  case CC_A(CC_D(CC_E(_, _, _), false, CC_E(_, _, _)), _) => 7 
  case CC_A(CC_E(_, CC_B(_), _), _) => 8 
  case CC_B(_) => 9 
  case CC_C(CC_A(CC_D(_, _, _), _), _, _) => 10 
  case CC_C(CC_A(CC_E(_, _, _), _), _, _) => 11 
}
}