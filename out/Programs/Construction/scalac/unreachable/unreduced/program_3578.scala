package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, Int]
case class CC_B[F](a: F) extends T_A[F, Int]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}