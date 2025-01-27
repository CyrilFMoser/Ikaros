package Program_30 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Char), b: Boolean) extends T_A[Byte, T_A[Byte, Boolean]]
case class CC_B[D](a: (Boolean,Char)) extends T_A[D, T_A[Boolean, D]]

val v_a: T_A[Byte, T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((_,'x'), _) => 0 
  case CC_A((_,_), _) => 1 
}
}
// This is not matched: (CC_A Boolean (Tuple Boolean Char) Wildcard (T_A Byte (T_A Byte Boolean)))
// This is not matched: (CC_A Boolean (T_A (T_A Boolean Boolean) Boolean))