package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B[B](a: T_A[B], b: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: T_A[Int], b: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_D() extends T_B
case class CC_E(a: Byte) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_D()) => 1 
  case CC_B(_, CC_E(0)) => 2 
  case CC_B(_, CC_E(_)) => 3 
  case CC_C(_, _) => 4 
}
}