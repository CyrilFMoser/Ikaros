package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: T_A[D, D], c: Int) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: T_A[E, E], b: E) extends T_A[E, T_A[E, E]]
case class CC_C[F, G](a: T_A[G, T_A[G, G]], b: Int) extends T_A[F, T_A[F, F]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, 'x') => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, 12) => 3 
  case CC_C(_, _) => 4 
}
}