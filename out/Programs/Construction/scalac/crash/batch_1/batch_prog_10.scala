package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B]) extends T_A[B]
case class CC_B(a: T_A[T_A[Char]], b: CC_A[T_A[Char]], c: T_A[CC_A[Char]]) extends T_A[T_A[Char]]
case class CC_C() extends T_A[T_A[CC_B]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
}
}
// This is not matched: CC_B(_, CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _)))