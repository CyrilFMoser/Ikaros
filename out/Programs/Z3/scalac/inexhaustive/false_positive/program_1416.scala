package Program_28 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A], c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: Byte) extends T_A
case class CC_D[B, C](a: Char) extends T_B[B]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
}
}
// This is not matched: (CC_D Char T_A Wildcard (T_B Char))
// This is not matched: (CC_B T_A Wildcard T_A)