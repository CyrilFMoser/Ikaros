package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: ((Char,Boolean),T_B[Int, Boolean])) extends T_A[E, T_B[T_B[Boolean, Char], T_A[Int, Char]]]
case class CC_B[F](a: T_B[F, F], b: CC_A[F], c: F) extends T_A[F, T_B[T_B[Boolean, Char], T_A[Int, Char]]]
case class CC_C[G]() extends T_A[G, T_B[T_B[Boolean, Char], T_A[Int, Char]]]
case class CC_D[I, H, J]() extends T_B[I, H]
case class CC_E[K, L](a: T_A[K, L], b: Boolean, c: T_A[L, L]) extends T_B[K, L]

val v_a: T_A[Int, T_B[T_B[Boolean, Char], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),CC_D())) => 0 
  case CC_A(_, ((_,_),CC_E(_, _, _))) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}