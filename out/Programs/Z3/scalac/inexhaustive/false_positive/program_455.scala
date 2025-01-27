package Program_30 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte], b: Int, c: Byte) extends T_A[Byte]
case class CC_B(a: T_B[Boolean], b: T_A[CC_A]) extends T_A[Byte]
case class CC_C[C, D](a: T_A[C]) extends T_A[C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C(_)) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_C (CC_A Boolean Boolean Boolean Boolean)
//            Boolean
//            Wildcard
//            (T_A (CC_A Boolean Boolean Boolean Boolean)))
//      (T_A Byte))
// This is not matched: Pattern match is empty without constants