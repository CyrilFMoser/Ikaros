package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: D, b: (Char,Char)) extends T_A[C]
case class CC_B(a: T_A[Int], b: Byte) extends T_B[T_B[Int]]
case class CC_C(a: CC_B) extends T_B[T_B[Int]]
case class CC_D(a: CC_A[CC_B, CC_C]) extends T_B[T_B[Int]]

val v_a: T_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A (CC_B Boolean Boolean Boolean)
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A (CC_B Boolean Boolean Boolean)))
// This is not matched: (CC_C Wildcard (CC_B Byte (T_A Boolean Byte)) (T_A Boolean (T_A Boolean Byte)))