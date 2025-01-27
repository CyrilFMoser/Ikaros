package Program_13 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C]() extends T_A[B]
case class CC_B(a: Int, b: T_A[(Int,Boolean)], c: T_B) extends T_B
case class CC_C(a: CC_A[(Byte,Byte), CC_B], b: T_A[T_B], c: T_A[CC_B]) extends T_B
case class CC_D(a: CC_B, b: CC_B) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_A(), _) => 0 
}
}
// This is not matched: (CC_C Wildcard
//      (CC_A T_B T_B (T_A T_B))
//      (CC_A (CC_B Wildcard Wildcard Wildcard Wildcard)
//            T_B
//            (T_A (CC_B Wildcard Wildcard Wildcard Wildcard)))
//      T_B)
// This is not matched: (CC_B (CC_D T_B T_B T_B T_B) (T_A (CC_D T_B T_B T_B T_B)))