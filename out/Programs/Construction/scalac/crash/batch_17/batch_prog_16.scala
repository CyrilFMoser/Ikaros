package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_A], b: T_A, c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: Boolean, b: Int, c: CC_A) extends T_A
case class CC_C[C, D, E]() extends T_B[D, C]
case class CC_D[G, F](a: G, b: F) extends T_B[G, F]
case class CC_E[I, H, J](a: CC_A, b: I, c: T_B[I, H]) extends T_B[H, I]

val v_a: T_B[T_A, Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, CC_A(_, _, _), CC_C()), _) => 1 
  case CC_D(CC_A(_, CC_A(_, _, _), CC_D(_, _)), _) => 2 
  case CC_D(CC_A(_, CC_B(_, _, _), CC_C()), _) => 3 
  case CC_D(CC_A(_, CC_B(_, _, _), CC_D(_, _)), _) => 4 
  case CC_D(CC_A(_, CC_B(_, _, _), CC_E(_, _, _)), _) => 5 
  case CC_D(CC_B(_, 12, CC_A(_, _, _)), _) => 6 
  case CC_D(CC_B(_, _, CC_A(_, _, _)), _) => 7 
  case CC_E(_, _, _) => 8 
}
}
// This is not matched: CC_D(CC_A(_, CC_A(_, _, _), CC_E(_, _, _)), _)