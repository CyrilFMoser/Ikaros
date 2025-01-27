package Program_29 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, Byte], b: Char) extends T_A
case class CC_B(a: CC_A, b: Int, c: T_B[T_A, CC_A]) extends T_A
case class CC_C(a: Boolean, b: T_B[CC_B, (Boolean,Boolean)], c: T_A) extends T_A
case class CC_D[D, C, E](a: T_B[D, D]) extends T_B[D, C]

val v_a: CC_D[T_A, Int, T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_)) => 0 
}
}
// This is not matched: (CC_D T_A Int T_A (CC_D T_A T_A T_A Wildcard (T_B T_A T_A)) (T_B T_A Int))
// This is not matched: (CC_A Char Boolean Wildcard (T_A (T_A Int Char) Char))