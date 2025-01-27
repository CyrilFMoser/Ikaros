package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[T_B]], b: T_B) extends T_A[T_A[T_B]]
case class CC_C(a: Boolean, b: T_A[(CC_A,T_B)], c: T_A[Byte]) extends T_A[T_A[T_B]]
case class CC_D() extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_B(_, CC_D()) => 1 
  case CC_C(true, _, _) => 2 
  case CC_C(false, _, _) => 3 
}
}