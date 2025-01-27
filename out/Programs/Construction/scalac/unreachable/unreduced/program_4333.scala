package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: D, c: Boolean) extends T_A[T_A[C, C], C]
case class CC_B[E](a: E, b: (CC_A[Int, Char],Char), c: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (CC_A(_, _, _),_), _) => 1 
}
}