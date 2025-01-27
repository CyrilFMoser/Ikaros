package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: T_A, b: T_B[T_A, T_A]) extends T_A
case class CC_C() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C() => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_D Int (T_B Int Int))