package Program_31 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[Boolean, (Boolean,Byte)]]

val v_a: T_A[Boolean, T_A[Boolean, (Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A Boolean (T_A Boolean (Tuple Boolean Byte))))
// This is not matched: (CC_C (T_A (T_A T_B)))