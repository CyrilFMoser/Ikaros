package Program_31 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_A, c: Byte) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[T_A]]) extends T_A
case class CC_C(a: T_A, b: (T_A,Boolean), c: Int) extends T_B[((CC_A,CC_B),CC_B)]
case class CC_D(a: CC_C, b: T_A, c: T_B[T_B[(Byte,Int)]]) extends T_B[((CC_A,CC_B),CC_B)]
case class CC_E[B](a: CC_D, b: B) extends T_B[((CC_A,CC_B),CC_B)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, CC_B(_, _), _), _) => 1 
}
}
// This is not matched: CC_B(CC_A(_, CC_A(_, _, _), _), _)
// This is not matched: CC_B(_, _, _)