package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Byte, c: T_B) extends T_A[T_B]
case class CC_B(a: T_A[T_A[T_B]], b: T_B, c: T_A[T_A[Boolean]]) extends T_A[T_B]
case class CC_C(a: Int, b: Int, c: (T_A[CC_B],T_B)) extends T_B
case class CC_D(a: CC_B, b: T_A[T_B], c: CC_C) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_D(_, _, _), _) => 1 
}
}
// This is not matched: CC_B(_, CC_C(_, _, _), _)