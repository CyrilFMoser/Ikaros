package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_B), b: (T_A[T_B],T_A[T_B]), c: T_A[Boolean]) extends T_A[(T_A[T_B],Boolean)]
case class CC_B(a: CC_A, b: T_A[T_B]) extends T_A[(T_A[T_B],Boolean)]
case class CC_C() extends T_A[(T_A[T_B],Boolean)]
case class CC_D() extends T_B

val v_a: T_A[(T_A[T_B],Boolean)] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)