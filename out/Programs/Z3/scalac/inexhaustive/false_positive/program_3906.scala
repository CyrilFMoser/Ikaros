package Program_15 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Byte)))
// This is not matched: (CC_E Wildcard Wildcard Wildcard T_B)