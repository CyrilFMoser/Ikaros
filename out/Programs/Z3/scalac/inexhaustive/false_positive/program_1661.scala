package Program_31 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_D (T_B (T_A Char) (T_A Byte)))