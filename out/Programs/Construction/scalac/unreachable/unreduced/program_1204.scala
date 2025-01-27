package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[Int]) extends T_B
case class CC_C() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_)) => 0 
  case CC_A(CC_C()) => 1 
}
}