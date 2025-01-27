package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[T_A[Char]], c: T_A[T_A[Char]]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), CC_A()) => 1 
  case CC_B(_, CC_A(), CC_B(_, _, _)) => 2 
  case CC_B(_, CC_B(_, _, CC_A()), CC_A()) => 3 
  case CC_B(_, CC_B(_, _, CC_A()), CC_B(_, _, _)) => 4 
  case CC_B(_, CC_B(_, _, CC_B(_, _, _)), CC_A()) => 5 
}
}
// This is not matched: CC_B(_, CC_B(_, _, CC_B(_, _, _)), CC_B(_, _, _))