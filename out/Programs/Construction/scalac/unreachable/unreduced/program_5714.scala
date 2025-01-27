package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B)], b: T_A[T_A[T_B]], c: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[CC_A]], b: (T_B,T_B), c: CC_A) extends T_A[T_A[T_B]]
case class CC_C() extends T_B
case class CC_D(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_D(CC_A(_, CC_B(_, _, _), CC_A(_, _, _))) => 2 
  case CC_D(CC_A(_, CC_A(_, _, _), CC_B(_, _, _))) => 3 
  case CC_D(CC_A(_, CC_B(_, _, _), CC_B(_, _, _))) => 4 
}
}