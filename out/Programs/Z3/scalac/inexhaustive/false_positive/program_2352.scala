package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Char), b: Boolean) extends T_A[Byte, T_A[Byte, Boolean]]
case class CC_B[D](a: (Boolean,Char)) extends T_A[D, T_A[Boolean, D]]

val v_a: T_A[Byte, T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Byte (T_A Byte Boolean)))
// This is not matched: (CC_A Boolean (T_A (T_A Boolean Boolean) Boolean))