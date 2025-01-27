package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: Int, b: T_B, c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: CC_B, b: Int, c: CC_B) extends T_A[T_A[T_A[T_B]]]
case class CC_D() extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D()) => 0 
  case CC_B(_, CC_D(), _) => 1 
  case CC_C(CC_B(_, _, _), _, _) => 2 
}
}