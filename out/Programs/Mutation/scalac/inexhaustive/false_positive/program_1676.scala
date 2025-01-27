package Program_60 

package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[C]) extends T_A[B]
case class CC_B(a: CC_A[(Char,Int), T_B]) extends T_A[((Boolean,Boolean),T_B)]

val v_a: T_A[((Boolean,Boolean),T_B)] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_A(_) => 1 
  case CC_A(CC_B(_)) => 2 
}
}
// This is not matched: (CC_A (Tuple (Tuple Boolean Boolean) T_B)
//      T_B
//      Wildcard
//      (T_A (Tuple (Tuple Boolean Boolean) T_B)))
// This is not matched: (CC_C Char Boolean (CC_B Boolean (T_B Boolean)) Wildcard (T_B Char))