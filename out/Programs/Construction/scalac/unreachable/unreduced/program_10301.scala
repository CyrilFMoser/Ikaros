package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, F], b: T_B[E, Int], c: E) extends T_A[E, F]
case class CC_B[G, H](a: T_A[G, G], b: CC_A[H, H]) extends T_A[G, H]
case class CC_C[I](a: T_A[I, I]) extends T_A[I, (T_A[Char, Int],T_A[Byte, Byte])]
case class CC_D() extends T_B[CC_C[CC_A[Boolean, Char]], T_B[CC_A[Boolean, Int], CC_B[Byte, Boolean]]]

val v_a: T_A[CC_D, (T_A[Char, Int],T_A[Byte, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_, _), _, _), _, _) => 1 
  case CC_A(CC_A(CC_C(_), _, _), _, _) => 2 
  case CC_A(CC_B(CC_A(_, _, _), CC_A(_, _, _)), _, _) => 3 
  case CC_A(CC_B(CC_B(_, _), CC_A(_, _, _)), _, _) => 4 
  case CC_A(CC_B(CC_C(_), CC_A(_, _, _)), _, _) => 5 
  case CC_A(CC_C(CC_A(_, _, _)), _, _) => 6 
  case CC_A(CC_C(CC_B(_, _)), _, _) => 7 
  case CC_A(CC_C(CC_C(_)), _, _) => 8 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 9 
  case CC_B(CC_B(_, _), CC_A(_, _, _)) => 10 
  case CC_C(_) => 11 
}
}