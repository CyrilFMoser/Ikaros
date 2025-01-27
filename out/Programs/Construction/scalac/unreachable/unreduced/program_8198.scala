package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Char]], b: Char, c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C() extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C()