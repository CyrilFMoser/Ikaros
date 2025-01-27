package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[D]]) extends T_A[D, T_B[D]]
case class CC_B[E](a: E, b: T_B[E], c: T_A[E, E]) extends T_A[E, T_B[E]]
case class CC_C[F]() extends T_B[F]

val v_a: T_A[Boolean, T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, CC_C(), _)) => 2 
  case CC_B(_, _, _) => 3 
}
}