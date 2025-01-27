package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Byte], c: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: ((Char,Int),CC_A), b: CC_A) extends T_A[Byte]
case class CC_C(a: T_B, b: Boolean, c: T_A[(Int,Boolean)]) extends T_A[Byte]
case class CC_D[B]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D T_B T_B)
// This is not matched: (CC_B T_A)