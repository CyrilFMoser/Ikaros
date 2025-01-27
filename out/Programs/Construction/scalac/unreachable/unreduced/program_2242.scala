package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: Byte) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[T_B], b: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: Char) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_C(_)) => 1 
}
}