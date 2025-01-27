package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_B[Boolean, Boolean], Int]]
case class CC_B[F](a: T_A[F, F], b: F) extends T_A[F, T_B[T_B[Boolean, Boolean], Int]]
case class CC_C[G, H](a: T_B[Int, Int]) extends T_B[H, G]

val v_a: T_A[Int, T_B[T_B[Boolean, Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}