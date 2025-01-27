package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_A[Boolean, E]]
case class CC_B[F]() extends T_A[F, T_A[Boolean, F]]

val v_a: T_A[Int, T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}