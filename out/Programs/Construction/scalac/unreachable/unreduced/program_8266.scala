package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[Byte], c: T_A[Int]) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: T_B) extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_C(a: T_A[T_B], b: T_A[T_A[T_B]], c: Boolean) extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_D() extends T_B

val v_a: T_A[(T_A[T_B],T_A[T_B])] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D()) => 0 
  case CC_C(CC_A(_, _, _), _, true) => 1 
  case CC_C(CC_A(_, _, _), _, false) => 2 
}
}