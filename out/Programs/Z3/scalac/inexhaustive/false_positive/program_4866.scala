package Program_15 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[Boolean, Int], T_A[Boolean, Byte]]
case class CC_B() extends T_A[T_A[Boolean, Int], T_A[Boolean, Byte]]
case class CC_C() extends T_A[T_A[Boolean, Int], T_A[Boolean, Byte]]

val v_a: T_A[T_A[Boolean, Int], T_A[Boolean, Byte]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_A(_) => 2 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Boolean Int) (T_A Boolean Byte)))
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Boolean Int) (T_A Boolean Byte)))