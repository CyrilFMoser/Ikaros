package Program_29 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Byte Boolean (T_A Byte))
// This is not matched: (CC_B Char Wildcard Char (T_A Char Char))