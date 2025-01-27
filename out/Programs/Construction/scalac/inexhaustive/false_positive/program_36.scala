package Program_63 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: B, b: Byte) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[CC_B], b: T_A, c: T_B[T_A]) extends T_B[T_A]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _), CC_C(_, _, CC_C(_, _, _))) => 0 
  case CC_C(_, CC_B(CC_B(_)), CC_C(_, _, CC_C(_, _, _))) => 1 
}
}
// This is not matched: CC_C(_, CC_B(CC_A(_, _)), CC_C(_, _, CC_C(_, _, _)))
// This is not matched: CC_B(CC_A(CC_B(_, _, _)), CC_A(_), _)