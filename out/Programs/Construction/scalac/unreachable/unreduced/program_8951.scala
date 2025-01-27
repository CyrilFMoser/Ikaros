package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C]) extends T_A[C]
case class CC_B() extends T_A[(T_A[Char],T_A[(Boolean,Boolean)])]
case class CC_C(a: T_A[CC_B], b: T_A[T_A[Char]], c: T_A[Int]) extends T_B[((CC_B,CC_B),T_A[CC_B])]

val v_a: T_A[(T_A[Char],T_A[(Boolean,Boolean)])] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_B(), _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_B() => 2 
}
}
// This is not matched: CC_A(CC_A(CC_A(_, _), _), _)