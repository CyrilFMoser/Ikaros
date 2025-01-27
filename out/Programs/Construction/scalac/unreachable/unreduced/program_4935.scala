package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[Byte, Byte],Boolean), b: T_B[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: CC_A[F], b: T_A[F, F]) extends T_A[F, T_A[F, F]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,true), _) => 0 
  case CC_A((_,false), _) => 1 
  case CC_B(_, _) => 2 
}
}