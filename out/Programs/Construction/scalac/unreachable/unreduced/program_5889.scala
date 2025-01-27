package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[Boolean, T_B], C]
case class CC_B[D](a: T_A[T_A[Boolean, T_B], D], b: T_B) extends T_A[T_A[Boolean, T_B], D]
case class CC_C[E](a: T_A[T_A[Boolean, T_B], E]) extends T_A[T_A[Boolean, T_B], E]

val v_a: T_A[T_A[Boolean, T_B], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_B(CC_B(CC_A(_, _), _), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
  case CC_B(CC_C(_), _) => 4 
  case CC_C(CC_A(_, _)) => 5 
  case CC_C(CC_B(_, _)) => 6 
  case CC_C(CC_C(_)) => 7 
}
}
// This is not matched: CC_B(CC_B(CC_C(_), _), _)