package Program_14 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D](a: T_A[C], b: T_A[D]) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_B Char
//      Boolean
//      (CC_A Char (T_A Char))
//      (CC_A Boolean (T_A Boolean))
//      (T_A Char))
// This is not matched: (CC_C Wildcard T_A)