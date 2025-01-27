package Program_14 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D]() extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Char Boolean (T_A Char))
// This is not matched: (CC_B (CC_A T_A)
//      (CC_B Wildcard Wildcard Wildcard T_A)
//      (CC_B Wildcard (CC_B Wildcard (CC_A T_A) Wildcard T_A) (CC_A T_A) T_A)
//      T_A)