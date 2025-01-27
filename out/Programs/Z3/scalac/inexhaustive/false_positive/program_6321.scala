package Program_15 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,Char), b: Boolean) extends T_A
case class CC_B[B]() extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: Int, b: Byte, c: (T_A,T_A)) extends T_B[C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((CC_C(),_), _) => 0 
  case CC_A((CC_B(),'x'), _) => 1 
  case CC_A((CC_B(),_), _) => 2 
  case CC_A((CC_A(_, _),_), _) => 3 
}
}
// This is not matched: (CC_A (Tuple (CC_B T_A T_A) Wildcard) Wildcard T_A)
// This is not matched: (CC_D Byte Wildcard Byte Wildcard (T_B (Tuple T_A (Tuple Int Boolean)) Byte))