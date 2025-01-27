package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[(Int,Boolean), Byte],T_A[Byte, Char])) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, T_B[F, F]]) extends T_A[F, T_B[F, F]]

val v_a: T_A[Int, T_B[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_A(_)) => 1 
}
}
// This is not matched: CC_B(CC_B(_))