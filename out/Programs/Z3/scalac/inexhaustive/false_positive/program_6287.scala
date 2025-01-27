package Program_14 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D], b: (Byte,Int)) extends T_A[C]
case class CC_B[E](a: (Boolean,Char), b: T_A[E]) extends T_A[E]
case class CC_C(a: T_A[Byte], b: Boolean) extends T_B[T_A[Byte]]
case class CC_D(a: Char) extends T_B[T_A[Byte]]
case class CC_E() extends T_B[T_A[Byte]]

val v_a: CC_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_B((_,'x'), _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_B (CC_D Boolean Boolean)
//      Wildcard
//      (CC_B (CC_D Boolean Boolean)
//            Wildcard
//            Wildcard
//            (T_A (CC_D Boolean Boolean)))
//      (T_A (CC_D Boolean Boolean)))
// This is not matched: (CC_C Wildcard (CC_B Int (T_A Int)) (T_A (T_A Byte)))