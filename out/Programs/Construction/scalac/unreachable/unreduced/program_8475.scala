package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: T_A[E, E], c: E) extends T_A[E, Int]
case class CC_B[F](a: CC_A[F], b: T_A[F, F], c: T_A[F, Int]) extends T_A[F, Int]
case class CC_C[G]() extends T_A[G, Int]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, _) => 1 
  case CC_C() => 2 
}
}