package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B[B](a: CC_A, b: CC_A, c: T_A[T_B]) extends T_B
case class CC_C(a: Boolean, b: (CC_A,T_B)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_A(), _, _) => 3 
  case CC_B(_, _, CC_A()) => 4 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_A (CC_A Byte Char Boolean Boolean)
//      Int
//      Wildcard
//      (T_A (CC_A Byte Char Boolean Boolean) Int))