package Program_14 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(Int,Byte), T_A], b: (T_A,T_A)) extends T_A
case class CC_B[D, C, E](a: Byte) extends T_B[D, C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), (CC_A(_, _),CC_A(_, _))) => 0 
}
}
// This is not matched: (CC_A (CC_B (Tuple Int Byte) T_A T_A Byte (T_B (Tuple Int Byte) T_A))
//      Wildcard
//      T_A)
// This is not matched: (CC_A T_A)