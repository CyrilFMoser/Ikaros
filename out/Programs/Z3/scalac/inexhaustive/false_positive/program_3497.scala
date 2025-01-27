package Program_15 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[Char]]
case class CC_B(a: T_A[Char], b: Char, c: CC_A) extends T_A[T_A[Char]]
case class CC_C[D, E](a: T_B[D, D], b: T_B[Char, D]) extends T_B[Char, D]
case class CC_D() extends T_B[Char, CC_C[(Byte,Int), CC_B]]
case class CC_E(a: T_A[CC_D]) extends T_B[Char, CC_C[(Byte,Int), CC_B]]

val v_a: CC_C[Byte, CC_E] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: (CC_C Byte
//      (CC_E Boolean (T_A Boolean))
//      Wildcard
//      (CC_C Byte
//            Boolean
//            Wildcard
//            (CC_C Byte Boolean Wildcard Wildcard (T_B Char Byte))
//            (T_B Char Byte))
//      (T_B Char Byte))
// This is not matched: (CC_D (CC_B Boolean) Wildcard (T_B (CC_B Boolean)))