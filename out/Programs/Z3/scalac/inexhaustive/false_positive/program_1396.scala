package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B[D](a: Int) extends T_A[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_A Byte Boolean (T_A Byte))
// This is not matched: (CC_C Char Byte Wildcard Wildcard (T_B Byte Char))