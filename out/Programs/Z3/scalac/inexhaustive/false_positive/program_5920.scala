package Program_14 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: Byte, c: T_B) extends T_A
case class CC_B(a: (T_B,CC_A)) extends T_A
case class CC_C() extends T_B
case class CC_D[A](a: A) extends T_B

val v_a: CC_D[T_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_)) => 0 
}
}
// This is not matched: (CC_D T_B (CC_C T_B) T_B)
// This is not matched: (CC_D T_B (CC_C T_B) T_B)