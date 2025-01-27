package Program_30 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[Char, C]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Byte Boolean (T_A Char Byte))
// This is not matched: (CC_A T_A)