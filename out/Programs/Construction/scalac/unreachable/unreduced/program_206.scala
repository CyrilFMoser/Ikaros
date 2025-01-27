package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[Byte], b: T_B, c: CC_A) extends T_A[T_A[T_B]]
case class CC_C(a: T_A[T_B], b: T_A[CC_A]) extends T_B
case class CC_D(a: (T_A[CC_C],CC_B), b: CC_B, c: CC_B) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(_, _, CC_A(_)) => 2 
}
}