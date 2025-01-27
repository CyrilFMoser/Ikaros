package Program_30 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C]() extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char T_B (T_A Char))
// This is not matched: (CC_C T_A Byte Wildcard Wildcard Wildcard (T_B Byte T_A))