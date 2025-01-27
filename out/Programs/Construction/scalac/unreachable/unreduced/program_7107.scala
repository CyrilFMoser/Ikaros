package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: (Char,T_A[Boolean, Byte]), b: T_B[F, T_A[E, E]], c: T_A[F, F]) extends T_A[F, E]
case class CC_B[H, G](a: Byte, b: (T_A[Int, Int],Char), c: G) extends T_A[H, G]
case class CC_C[I, J](a: J) extends T_A[J, I]
case class CC_D() extends T_B[CC_C[T_A[Int, Int], CC_B[Char, Byte]], CC_C[T_A[Byte, Char], CC_C[Char, (Byte,Boolean)]]]

val v_a: T_A[Boolean, CC_D] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _, _)), _, CC_A(_, _, _)) => 0 
  case CC_A((_,CC_A(_, _, _)), _, CC_B(_, _, _)) => 1 
  case CC_A((_,CC_B(_, _, _)), _, CC_A(_, _, _)) => 2 
  case CC_A((_,CC_B(_, _, _)), _, CC_B(_, _, _)) => 3 
  case CC_A((_,CC_B(_, _, _)), _, CC_C(_)) => 4 
  case CC_A((_,CC_C(_)), _, CC_A(_, _, _)) => 5 
  case CC_A((_,CC_C(_)), _, CC_B(_, _, _)) => 6 
  case CC_A((_,CC_C(_)), _, CC_C(_)) => 7 
  case CC_B(_, _, _) => 8 
  case CC_C(_) => 9 
}
}
// This is not matched: CC_A((_,CC_A(_, _, _)), _, CC_C(_))