package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: Int, c: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: F, b: Boolean, c: T_A[F]) extends T_A[F]
case class CC_D[G]() extends T_B[T_A[CC_B[Int]], G]
case class CC_E[H](a: T_A[T_B[H, Boolean]], b: (CC_A[Int],(Boolean,Boolean))) extends T_B[T_A[CC_B[Int]], H]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_A(_, CC_C(_, _, _)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(_, _, CC_A(_, _)) => 4 
  case CC_C(_, _, CC_B(_, _, _)) => 5 
  case CC_C(_, _, CC_C(_, _, _)) => 6 
}
}