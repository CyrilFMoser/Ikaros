package Program_15 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: C) extends T_A[B]

val v_a: CC_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), 0) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A T_A)