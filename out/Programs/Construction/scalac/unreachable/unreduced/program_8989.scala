package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: T_B[Boolean], b: T_B[CC_A]) extends T_A[T_B[T_A[Boolean]]]
case class CC_C[C](a: T_B[C], b: T_A[C], c: T_A[C]) extends T_B[C]
case class CC_D[D]() extends T_B[D]
case class CC_E[E](a: (CC_A,CC_D[CC_B]), b: CC_B, c: T_B[E]) extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
  case CC_E((CC_A(),CC_D()), CC_B(CC_C(_, _, _), _), CC_C(_, _, _)) => 2 
  case CC_E((CC_A(),CC_D()), CC_B(CC_C(_, _, _), _), CC_D()) => 3 
  case CC_E((CC_A(),CC_D()), CC_B(CC_C(_, _, _), _), CC_E((_,_), CC_B(_, _), CC_C(_, _, _))) => 4 
  case CC_E((CC_A(),CC_D()), CC_B(CC_C(_, _, _), _), CC_E((_,_), CC_B(_, _), CC_D())) => 5 
  case CC_E((CC_A(),CC_D()), CC_B(CC_C(_, _, _), _), CC_E((_,_), CC_B(_, _), CC_E(_, _, _))) => 6 
  case CC_E((CC_A(),CC_D()), CC_B(CC_D(), _), CC_C(_, _, _)) => 7 
  case CC_E((CC_A(),CC_D()), CC_B(CC_D(), _), CC_D()) => 8 
  case CC_E((CC_A(),CC_D()), CC_B(CC_D(), _), CC_E((_,_), CC_B(_, _), CC_C(_, _, _))) => 9 
  case CC_E((CC_A(),CC_D()), CC_B(CC_D(), _), CC_E((_,_), CC_B(_, _), CC_D())) => 10 
  case CC_E((CC_A(),CC_D()), CC_B(CC_D(), _), CC_E((_,_), CC_B(_, _), CC_E(_, _, _))) => 11 
  case CC_E((CC_A(),CC_D()), CC_B(CC_E(_, _, _), _), CC_C(_, _, _)) => 12 
  case CC_E((CC_A(),CC_D()), CC_B(CC_E(_, _, _), _), CC_D()) => 13 
  case CC_E((CC_A(),CC_D()), CC_B(CC_E(_, _, _), _), CC_E((_,_), CC_B(_, _), CC_C(_, _, _))) => 14 
  case CC_E((CC_A(),CC_D()), CC_B(CC_E(_, _, _), _), CC_E((_,_), CC_B(_, _), CC_D())) => 15 
}
}
// This is not matched: CC_E((CC_A(),CC_D()), CC_B(CC_E(_, _, _), _), CC_E((_,_), CC_B(_, _), CC_E(_, _, _)))