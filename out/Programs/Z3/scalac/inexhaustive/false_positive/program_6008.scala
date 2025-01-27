package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E](a: T_B) extends T_A[D, C]
case class CC_B[F, G](a: CC_A[T_B, G, Int]) extends T_A[F, G]
case class CC_C(a: Byte, b: T_A[(Char,Char), (Boolean,Boolean)]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Int, CC_C] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(_) => 1 
  case CC_A(CC_D()) => 2 
}
}
// This is not matched: (CC_A Int
//      (CC_C T_B T_B T_B)
//      T_B
//      (CC_C Wildcard Wildcard T_B)
//      (T_A Int (CC_C T_B T_B T_B)))
// This is not matched: (CC_B Int (CC_C T_B T_B T_B) Wildcard (T_A Int (CC_C T_B T_B T_B)))