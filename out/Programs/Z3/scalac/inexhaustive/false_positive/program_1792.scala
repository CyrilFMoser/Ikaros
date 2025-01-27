package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B() extends T_A[Byte]
case class CC_C[E, F]() extends T_A[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C() => 1 
}
}
// This is not matched: (CC_C Char Boolean (T_A Char))
// This is not matched: (CC_A Byte (CC_B Byte Wildcard Wildcard Wildcard (T_A Byte)) (T_A Byte))