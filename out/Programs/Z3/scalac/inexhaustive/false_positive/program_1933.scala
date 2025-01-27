package Program_30 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[((Boolean,Int),Byte)]
case class CC_B[D](a: T_B[D]) extends T_A[((Boolean,Int),Byte)]
case class CC_C[E](a: CC_A[E]) extends T_B[E]

val v_a: T_A[((Boolean,Int),Byte)] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_)) => 0 
  case CC_B(CC_C(_)) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (Tuple (Tuple Boolean Int) Byte)))
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (CC_A Wildcard Wildcard (CC_C Byte Wildcard Byte (T_A Byte)) (T_A Byte))
//      (T_A Byte))