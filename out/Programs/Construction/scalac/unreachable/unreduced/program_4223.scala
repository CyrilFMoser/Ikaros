package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Boolean, C], C], b: T_A[C, C]) extends T_A[Boolean, C]
case class CC_B[D]() extends T_A[Boolean, D]
case class CC_C[E](a: T_A[Boolean, E]) extends T_A[Boolean, E]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _)) => 2 
  case CC_C(CC_B()) => 3 
  case CC_C(CC_C(CC_A(_, _))) => 4 
  case CC_C(CC_C(CC_B())) => 5 
  case CC_C(CC_C(CC_C(_))) => 6 
}
}