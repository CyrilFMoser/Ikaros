package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte) extends T_A[T_A[C, Boolean], C]

val v_a: T_A[T_A[Byte, Boolean], Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A (T_A Byte Boolean) Byte))
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (CC_A Wildcard Wildcard (CC_C Byte Wildcard Byte (T_A Byte)) (T_A Byte))
//      (T_A Byte))