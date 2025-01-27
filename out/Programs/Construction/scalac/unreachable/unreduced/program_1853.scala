package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[Int, C]
case class CC_B[E](a: T_A[Int, E], b: Boolean) extends T_A[Int, E]
case class CC_C[F](a: Boolean, b: T_A[F, T_A[Int, F]], c: CC_A[F, F]) extends T_A[Int, F]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(), _) => 2 
  case CC_C(_, CC_B(_, _), _) => 3 
  case CC_C(_, CC_C(_, _, _), _) => 4 
}
}