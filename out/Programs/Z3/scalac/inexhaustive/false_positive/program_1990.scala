package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[(Int,Boolean)]

val v_a: T_A[(Int,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (Tuple Int Boolean)))
// This is not matched: (CC_B T_A)