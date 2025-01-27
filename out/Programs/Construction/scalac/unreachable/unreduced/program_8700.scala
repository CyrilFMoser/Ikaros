package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]], b: T_B[T_B[Boolean]], c: T_B[T_A[Boolean]]) extends T_A[T_A[T_B[Char]]]
case class CC_B(a: T_A[CC_A], b: (T_B[CC_A],CC_A)) extends T_A[T_A[T_B[Char]]]
case class CC_C(a: T_B[CC_B], b: T_A[CC_A]) extends T_A[T_A[T_B[Char]]]
case class CC_D[C](a: C) extends T_B[C]
case class CC_E[D]() extends T_B[D]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_D(_)), CC_D(CC_D(_)), _) => 0 
  case CC_A(CC_D(CC_D(_)), CC_D(CC_E()), _) => 1 
  case CC_A(CC_D(CC_D(_)), CC_E(), _) => 2 
  case CC_A(CC_D(CC_E()), CC_D(CC_D(_)), _) => 3 
  case CC_A(CC_D(CC_E()), CC_D(CC_E()), _) => 4 
  case CC_A(CC_D(CC_E()), CC_E(), _) => 5 
  case CC_A(CC_E(), CC_D(CC_E()), _) => 6 
  case CC_A(CC_E(), CC_E(), _) => 7 
  case CC_B(_, (CC_D(_),CC_A(_, _, _))) => 8 
  case CC_B(_, (CC_E(),CC_A(_, _, _))) => 9 
  case CC_C(CC_D(_), _) => 10 
  case CC_C(CC_E(), _) => 11 
}
}
// This is not matched: CC_A(CC_E(), CC_D(CC_D(_)), _)