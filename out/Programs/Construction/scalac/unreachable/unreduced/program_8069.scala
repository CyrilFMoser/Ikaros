package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_B), b: T_B, c: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[T_B]], b: T_A[T_B], c: CC_A) extends T_A[T_A[T_B]]
case class CC_C() extends T_A[T_A[T_B]]
case class CC_D(a: CC_B, b: CC_A, c: T_A[T_A[T_B]]) extends T_B
case class CC_E(a: T_B, b: T_A[T_A[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A((_,_), _, CC_D(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_D(_, CC_A((_,_), _, CC_D(_, _, _)), CC_C()) => 1 
  case CC_D(_, CC_A((_,_), _, CC_E(_, _)), CC_A(_, _, _)) => 2 
  case CC_D(_, CC_A((_,_), _, CC_E(_, _)), CC_B(_, _, _)) => 3 
  case CC_D(_, CC_A((_,_), _, CC_E(_, _)), CC_C()) => 4 
  case CC_E(_, _) => 5 
}
}
// This is not matched: CC_D(_, CC_A((_,_), _, CC_D(_, _, _)), CC_B(_, _, _))