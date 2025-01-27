package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E, F]() extends T_A[E]
case class CC_C() extends T_B[CC_B[(Boolean,Int), Byte], T_A[Char]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A() => 1 
}
}
// This is not matched: (CC_B Char Boolean (T_A Char))
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)