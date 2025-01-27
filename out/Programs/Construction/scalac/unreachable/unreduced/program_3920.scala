package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B], c: T_A[Int]) extends T_A[T_B]
case class CC_B() extends T_B
case class CC_C(a: CC_A, b: Byte, c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _, _), _, CC_B()) => 1 
  case CC_C(CC_A(_, _, _), _, CC_C(_, _, CC_B())) => 2 
  case CC_C(CC_A(_, _, _), _, CC_C(_, _, CC_C(_, _, _))) => 3 
}
}