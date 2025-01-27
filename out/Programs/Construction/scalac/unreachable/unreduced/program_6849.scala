package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Char, c: T_A[T_A[T_B]]) extends T_A[T_A[T_A[T_B]]]
case class CC_B() extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: T_B, b: T_B) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), CC_A(_, _, _)) => 1 
}
}
// This is not matched: CC_A(_, _, _)