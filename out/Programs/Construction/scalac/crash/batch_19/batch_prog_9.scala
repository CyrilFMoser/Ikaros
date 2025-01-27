package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: (T_A[T_B],T_A[T_B]), b: T_A[B], c: T_B) extends T_A[B]
case class CC_B(a: CC_A[CC_A[T_B]], b: T_A[CC_A[T_B]]) extends T_B
case class CC_C(a: Boolean, b: T_A[T_A[T_B]], c: Byte) extends T_B
case class CC_D(a: T_A[CC_B], b: T_A[T_B], c: CC_A[Boolean]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(true, CC_A(_, _, _), _) => 0 
  case CC_C(false, CC_A(_, _, _), _) => 1 
}
}