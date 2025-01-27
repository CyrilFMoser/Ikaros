package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Boolean, b: D) extends T_A[T_A[Byte, Byte], C]

val v_a: T_A[T_A[Byte, Byte], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A (T_A Byte Byte) Char))
// This is not matched: (CC_A (CC_B T_A) T_A)