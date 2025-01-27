package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char) extends T_A[T_A[T_B]]
case class CC_B(a: Byte, b: T_A[T_B], c: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_C[B](a: B, b: T_B) extends T_A[T_A[T_B]]
case class CC_D(a: T_A[T_A[T_B]]) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_D(_)) => 2 
}
}