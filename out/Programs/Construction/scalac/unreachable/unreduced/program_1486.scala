package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (T_A[Int, Boolean],T_A[Byte, Boolean])) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: T_A[E, E], b: E, c: E) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: T_A[F, T_A[F, F]], b: CC_B[F]) extends T_A[F, T_A[F, F]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}