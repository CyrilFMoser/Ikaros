package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: B, b: Boolean) extends T_A[B]
case class CC_B() extends T_A[T_B]
case class CC_C[D]() extends T_A[T_B]
case class CC_D(a: T_A[T_B], b: T_A[CC_B], c: CC_A[(Boolean,Byte), CC_B]) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A (T_A T_B)
//      T_B
//      (CC_A T_B T_B Wildcard Boolean (T_A T_B))
//      Wildcard
//      (T_A (T_A T_B)))
// This is not matched: (CC_B Byte (T_A Byte Byte) (T_A Byte (T_A Byte Byte)))