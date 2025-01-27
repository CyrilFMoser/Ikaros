package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: Char, b: T_A[T_A[Int]], c: T_A[Int]) extends T_B[CC_A[Char]]
case class CC_C(a: T_B[T_A[CC_B]], b: CC_A[CC_A[CC_B]]) extends T_B[CC_A[Char]]
case class CC_D() extends T_B[CC_A[Char]]

val v_a: T_B[CC_A[Char]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(_, _, _)