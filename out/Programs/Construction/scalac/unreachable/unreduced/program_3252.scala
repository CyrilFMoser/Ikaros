package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Char) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[(T_B,T_B)], b: CC_A[T_B], c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C() extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: Byte) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_D(0)) => 1 
  case CC_B(_, CC_A(_), CC_D(_)) => 2 
  case CC_C() => 3 
}
}