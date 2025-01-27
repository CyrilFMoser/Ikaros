package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_B[T_B[T_A]], c: T_A) extends T_A
case class CC_B(a: T_B[T_A]) extends T_A
case class CC_C(a: (CC_A,T_A), b: CC_A) extends T_B[T_B[T_B[CC_B]]]
case class CC_D(a: T_A, b: T_A) extends T_B[T_B[T_B[CC_B]]]
case class CC_E[B]() extends T_B[T_B[T_B[CC_B]]]

val v_a: T_B[T_B[T_B[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, CC_B(_))) => 1 
  case CC_D(CC_A(_, _, CC_A(_, _, _)), CC_B(_)) => 2 
  case CC_D(CC_A(_, _, CC_B(_)), CC_A(_, _, CC_A(_, _, _))) => 3 
  case CC_D(CC_A(_, _, CC_B(_)), CC_A(_, _, CC_B(_))) => 4 
  case CC_D(CC_A(_, _, CC_B(_)), CC_B(_)) => 5 
  case CC_D(CC_B(_), CC_A(_, _, CC_A(_, _, _))) => 6 
  case CC_D(CC_B(_), CC_A(_, _, CC_B(_))) => 7 
  case CC_D(CC_B(_), CC_B(_)) => 8 
  case CC_E() => 9 
}
}
// This is not matched: CC_D(CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _)))