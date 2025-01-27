package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (Int,T_A[Boolean, Int]), b: T_B[D], c: T_B[D]) extends T_A[T_A[T_A[Int, Boolean], T_B[Boolean]], D]
case class CC_B() extends T_A[T_A[T_A[Int, Boolean], T_B[Boolean]], CC_A[CC_A[Int]]]
case class CC_C[E]() extends T_A[T_A[T_A[Int, Boolean], T_B[Boolean]], CC_A[CC_A[Int]]]
case class CC_D[F](a: T_A[F, F], b: T_B[CC_B]) extends T_B[F]
case class CC_E[G]() extends T_B[G]

val v_a: CC_A[T_A[T_A[T_A[Int, Boolean], T_B[Boolean]], CC_A[CC_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _), CC_D(_, _)) => 0 
  case CC_A(_, CC_E(), CC_D(_, _)) => 1 
  case CC_A(_, CC_D(_, _), CC_E()) => 2 
  case CC_A(_, CC_E(), CC_E()) => 3 
}
}