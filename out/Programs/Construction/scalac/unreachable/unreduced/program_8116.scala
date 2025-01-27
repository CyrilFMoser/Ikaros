package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_A[Int, D]) extends T_A[Int, D]
case class CC_B(a: T_A[(Int,Boolean), T_A[Int, Boolean]], b: T_A[Int, T_B[Char]], c: T_A[Int, Char]) extends T_A[Int, T_B[Boolean]]
case class CC_C[E](a: E) extends T_A[Int, E]
case class CC_D[F]() extends T_B[F]
case class CC_E[G](a: T_A[G, G]) extends T_B[G]

val v_a: T_A[Int, T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_B(_, CC_A(_, _, _), CC_C(_)) => 2 
  case CC_B(_, CC_C(_), CC_A(_, _, _)) => 3 
  case CC_C(CC_D()) => 4 
  case CC_C(CC_E(_)) => 5 
}
}
// This is not matched: CC_B(_, CC_C(_), CC_C(_))