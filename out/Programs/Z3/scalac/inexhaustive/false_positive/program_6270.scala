package Program_14 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[C], b: T_B, c: (T_B,T_B)) extends T_A[B]
case class CC_B[D](a: T_A[D], b: D) extends T_A[D]
case class CC_C(a: CC_A[T_B, (Boolean,Byte)]) extends T_B

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_A Byte
//            (CC_C (T_A T_B) T_B)
//            (CC_B (CC_C T_B T_B) Wildcard Wildcard (T_A (CC_C T_B T_B)))
//            Wildcard
//            (Tuple (CC_C Wildcard T_B) Wildcard)
//            (T_A Byte))
//      Wildcard
//      (T_A Byte))
// This is not matched: (CC_C Wildcard T_A)