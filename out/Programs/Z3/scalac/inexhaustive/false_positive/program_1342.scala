package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Byte Boolean (T_A (T_A Byte Byte) Byte))
// This is not matched: (CC_A Byte Boolean (T_A (T_A Byte Byte) Byte))