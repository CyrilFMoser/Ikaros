package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (T_A[Boolean, Boolean],T_A[Char, Int])) extends T_A[C, T_A[C, Boolean]]
case class CC_B[E](a: E, b: E, c: CC_A[E, E]) extends T_A[E, T_A[E, Boolean]]
case class CC_C[F](a: Byte) extends T_A[F, T_A[F, Boolean]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, CC_A((_,_))) => 1 
  case CC_C(0) => 2 
  case CC_C(_) => 3 
}
}