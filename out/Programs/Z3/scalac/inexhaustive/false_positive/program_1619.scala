package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_B) extends T_A[B]
case class CC_B[C](a: T_A[C], b: T_A[C]) extends T_A[C]
case class CC_C() extends T_A[CC_A[T_B]]
case class CC_D() extends T_B
case class CC_E[D](a: D, b: (CC_C,T_B)) extends T_B

val v_a: CC_E[CC_D] = null
val v_b: Int = v_a match{
  case CC_E(_, (CC_C(),CC_D())) => 0 
  case CC_E(CC_D(), (CC_C(),CC_E(_, _))) => 1 
}
}
// This is not matched: (CC_E (CC_D T_B) Wildcard (Tuple Wildcard (CC_E T_B Wildcard Wildcard T_B)) T_B)
// This is not matched: (CC_D (T_B (CC_B (CC_A (T_A Boolean) Boolean Boolean)
//                 Boolean
//                 Boolean
//                 Boolean
//                 Boolean)))