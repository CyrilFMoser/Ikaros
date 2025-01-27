package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_A[T_B]], b: Int) extends T_A[T_B]
case class CC_C(a: T_A[T_B], b: T_B, c: CC_A) extends T_A[T_B]
case class CC_D(a: CC_B, b: T_A[Byte], c: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)