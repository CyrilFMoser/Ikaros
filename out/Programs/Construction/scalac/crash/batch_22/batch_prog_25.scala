package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char, b: T_A[B]) extends T_A[B]
case class CC_B(a: T_A[T_A[Boolean]]) extends T_A[CC_A[CC_A[Boolean]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
}
}