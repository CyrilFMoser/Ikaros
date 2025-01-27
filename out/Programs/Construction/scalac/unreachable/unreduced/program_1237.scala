package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_A[E]) extends T_A[E]
case class CC_C() extends T_A[Boolean]
case class CC_D[F](a: T_A[F]) extends T_B[F, T_A[T_A[Boolean]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _), _) => 1 
  case CC_A(CC_C(), _) => 2 
  case CC_B(_, CC_A(_, _)) => 3 
  case CC_B(_, CC_B(_, _)) => 4 
  case CC_B(_, CC_C()) => 5 
}
}
// This is not matched: CC_C()