package Program_15 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[(Char,Byte)]

val v_a: T_A[(Char,Byte)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (Tuple Char Byte)))
// This is not matched: Pattern match is empty without constants