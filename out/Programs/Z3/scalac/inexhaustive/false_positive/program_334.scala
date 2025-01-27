package Program_30 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Boolean], c: (Boolean,Byte)) extends T_A[T_A[Boolean]]
case class CC_B[B](a: CC_A, b: B) extends T_A[T_A[Boolean]]
case class CC_C[C, D](a: CC_B[C]) extends T_A[C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), CC_C(_), _) => 0 
}
}
// This is not matched: (CC_A (CC_C Boolean
//            Boolean
//            (CC_B Boolean Wildcard Boolean (T_A (T_A Boolean)))
//            (T_A Boolean))
//      Wildcard
//      Wildcard
//      (T_A (T_A Boolean)))
// This is not matched: (CC_C Byte Wildcard Wildcard Wildcard (T_A (T_A Byte Byte) Byte))