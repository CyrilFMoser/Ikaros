package Program_29 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[(Byte,Char)]]
case class CC_B[C]() extends T_A[T_A[(Byte,Char)]]

val v_a: T_A[T_A[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Boolean (T_A (T_A (Tuple Byte Char))))
// This is not matched: (CC_A Byte Char Wildcard Wildcard (T_A Char Byte))