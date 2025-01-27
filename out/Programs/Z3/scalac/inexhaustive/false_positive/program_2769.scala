package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B() extends T_A[T_A[T_B, T_B], CC_A[T_B, (Boolean,Byte)]]
case class CC_C[E](a: CC_B) extends T_A[T_A[T_B, T_B], CC_A[T_B, (Boolean,Byte)]]

val v_a: T_A[T_A[T_B, T_B], CC_A[T_B, (Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(CC_B()) => 2 
}
}
// This is not matched: (CC_C T_B
//      (CC_B (T_A (T_A T_B T_B) (CC_A T_B (Tuple Boolean Byte) T_B)))
//      (T_A (T_A T_B T_B) (CC_A T_B (Tuple Boolean Byte) (T_A T_B T_B))))
// This is not matched: (CC_A T_A)