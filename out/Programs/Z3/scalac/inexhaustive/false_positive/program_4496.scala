package Program_15 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[Int, (Byte,Char)]]

val v_a: T_A[Boolean, T_A[Int, (Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A Boolean (T_A Int (Tuple Byte Char))))
// This is not matched: (CC_A Wildcard (Tuple (CC_C T_A) Wildcard) T_A)