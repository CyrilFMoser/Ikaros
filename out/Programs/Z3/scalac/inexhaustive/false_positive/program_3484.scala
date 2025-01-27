package Program_15 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C, D]() extends T_B[C, T_B[T_A, T_A]]
case class CC_C[E](a: CC_B[E, E]) extends T_B[E, T_B[T_A, T_A]]

val v_a: T_B[Int, T_B[T_A, T_A]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B()) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: (CC_B Int T_A (T_B Int (T_B T_A T_A)))
// This is not matched: (CC_A (CC_E Boolean (T_A Boolean) Boolean Boolean)
//      Wildcard
//      (T_A (CC_E Boolean (T_A Boolean) Boolean Boolean)))