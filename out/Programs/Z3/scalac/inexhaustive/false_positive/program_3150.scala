package Program_15 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte, b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: D) extends T_A[C]
case class CC_C(a: T_A[(Boolean,Byte)]) extends T_A[T_A[Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_)) => 0 
}
}
// This is not matched: (CC_C (CC_A (Tuple Boolean Byte)
//            Byte
//            Wildcard
//            Wildcard
//            (T_A (Tuple Boolean Byte)))
//      (T_A (T_A Byte)))
// This is not matched: Pattern match is empty without constants