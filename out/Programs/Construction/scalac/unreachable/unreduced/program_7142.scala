package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[D, E]) extends T_A[T_B[D], D]
case class CC_B[F](a: F) extends T_A[T_B[F], F]

val v_a: T_A[T_B[Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}