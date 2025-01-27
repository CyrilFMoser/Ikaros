package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, F], b: T_B[E, F], c: T_A[F, E]) extends T_A[F, E]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C[I](a: T_A[I, CC_B[Boolean, Char]], b: I) extends T_A[I, CC_B[Boolean, Char]]
case class CC_D[J]() extends T_B[(T_A[Char, Int],Char), J]
case class CC_E[K](a: (T_A[Boolean, Char],T_A[(Char,Char), Char]), b: K, c: T_A[Int, K]) extends T_B[K, T_A[K, K]]
case class CC_F(a: T_A[CC_C[Int], CC_B[Boolean, Char]], b: CC_D[T_A[Int, Byte]], c: T_A[(Byte,Byte), T_A[Boolean, Char]]) extends T_B[Int, T_A[Int, Int]]

val v_a: CC_E[Byte] = null
val v_b: Int = v_a match{
  case CC_E((CC_A(_, _, _),CC_A(_, _, _)), _, CC_A(_, _, _)) => 0 
  case CC_E((CC_A(_, _, _),CC_A(_, _, _)), _, CC_B()) => 1 
  case CC_E((CC_A(_, _, _),CC_B()), _, CC_A(_, _, _)) => 2 
  case CC_E((CC_A(_, _, _),CC_B()), _, CC_B()) => 3 
  case CC_E((CC_B(),CC_A(_, _, _)), _, CC_A(_, _, _)) => 4 
  case CC_E((CC_B(),CC_A(_, _, _)), _, CC_B()) => 5 
  case CC_E((CC_B(),CC_B()), _, CC_A(_, _, _)) => 6 
  case CC_E((CC_B(),CC_B()), _, CC_B()) => 7 
}
}