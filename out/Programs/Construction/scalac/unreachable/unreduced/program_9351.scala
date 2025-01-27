package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D]) extends T_A[C, (T_A[Int, Int],Int)]
case class CC_B[E](a: CC_A[E, T_A[E, E]], b: CC_A[T_A[E, E], E], c: Int) extends T_A[E, (T_A[Int, Int],Int)]
case class CC_C[F]() extends T_A[F, (T_A[Int, Int],Int)]

val v_a: T_A[Int, (T_A[Int, Int],Int)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
}
}
// This is not matched: CC_C()