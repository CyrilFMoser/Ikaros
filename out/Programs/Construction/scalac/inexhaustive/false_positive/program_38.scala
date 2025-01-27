package Program_63 

package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_B[C]) extends T_A[T_A[T_B[Byte]]]
case class CC_B[D](a: Char) extends T_A[T_A[T_B[Byte]]]
case class CC_C(a: T_A[CC_B[Byte]], b: Int) extends T_A[T_A[T_B[Byte]]]
case class CC_D[E](a: T_A[Int], b: E) extends T_B[E]
case class CC_E(a: T_A[Int]) extends T_B[(T_B[CC_C],T_B[CC_C])]

val v_a: T_B[T_A[T_A[T_B[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _)) => 0 
  case CC_D(_, CC_B(_)) => 1 
}
}
// This is not matched: CC_D(_, CC_C(_, _))
// This is not matched: CC_C((CC_A(_),CC_B(_, _)))