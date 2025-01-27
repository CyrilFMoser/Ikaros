package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, D], b: T_B[E], c: T_B[E]) extends T_A[D, E]
case class CC_B[F, G, H](a: T_A[F, H], b: CC_A[G, F], c: CC_A[G, H]) extends T_A[G, F]
case class CC_C(a: T_A[T_A[Int, Byte], T_A[Boolean, Byte]], b: T_B[((Int,Int),Boolean)]) extends T_B[T_A[CC_A[Char, Boolean], Byte]]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _, _), _, _) => 1 
  case CC_B(_, _, _) => 2 
}
}