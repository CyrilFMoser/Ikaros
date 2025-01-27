package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: Boolean, b: CC_A, c: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[T_A[T_B]], b: (T_A[T_B],T_A[T_B]), c: T_A[T_B]) extends T_B
case class CC_D(a: T_A[T_B], b: T_A[T_B]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_A(_),CC_A(_)), CC_A(CC_C(_, _, _))) => 0 
  case CC_C(_, (CC_A(_),CC_A(_)), CC_A(CC_D(_, _))) => 1 
  case CC_C(_, (CC_A(_),CC_A(_)), CC_A(CC_E())) => 2 
  case CC_C(_, (CC_A(_),CC_A(_)), CC_B(true, CC_A(_), CC_A(_))) => 3 
  case CC_C(_, (CC_A(_),CC_A(_)), CC_B(false, CC_A(_), CC_A(_))) => 4 
  case CC_C(_, (CC_A(_),CC_A(_)), CC_B(true, CC_A(_), CC_B(_, _, _))) => 5 
  case CC_C(_, (CC_A(_),CC_A(_)), CC_B(false, CC_A(_), CC_B(_, _, _))) => 6 
  case CC_C(_, (CC_A(_),CC_B(_, _, _)), CC_A(CC_C(_, _, _))) => 7 
  case CC_C(_, (CC_A(_),CC_B(_, _, _)), CC_A(CC_D(_, _))) => 8 
  case CC_C(_, (CC_A(_),CC_B(_, _, _)), CC_A(CC_E())) => 9 
  case CC_C(_, (CC_A(_),CC_B(_, _, _)), CC_B(true, CC_A(_), CC_A(_))) => 10 
  case CC_C(_, (CC_A(_),CC_B(_, _, _)), CC_B(false, CC_A(_), CC_A(_))) => 11 
  case CC_C(_, (CC_A(_),CC_B(_, _, _)), CC_B(true, CC_A(_), CC_B(_, _, _))) => 12 
  case CC_C(_, (CC_A(_),CC_B(_, _, _)), CC_B(false, CC_A(_), CC_B(_, _, _))) => 13 
  case CC_C(_, (CC_B(_, _, _),CC_A(_)), CC_A(CC_C(_, _, _))) => 14 
  case CC_C(_, (CC_B(_, _, _),CC_A(_)), CC_A(CC_D(_, _))) => 15 
  case CC_C(_, (CC_B(_, _, _),CC_A(_)), CC_A(CC_E())) => 16 
  case CC_C(_, (CC_B(_, _, _),CC_A(_)), CC_B(true, CC_A(_), CC_A(_))) => 17 
  case CC_C(_, (CC_B(_, _, _),CC_A(_)), CC_B(false, CC_A(_), CC_A(_))) => 18 
  case CC_C(_, (CC_B(_, _, _),CC_A(_)), CC_B(true, CC_A(_), CC_B(_, _, _))) => 19 
  case CC_C(_, (CC_B(_, _, _),CC_A(_)), CC_B(false, CC_A(_), CC_B(_, _, _))) => 20 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_A(CC_C(_, _, _))) => 21 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_A(CC_D(_, _))) => 22 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_A(CC_E())) => 23 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_B(true, CC_A(_), CC_A(_))) => 24 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_B(false, CC_A(_), CC_A(_))) => 25 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_B(true, CC_A(_), CC_B(_, _, _))) => 26 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_B(false, CC_A(_), CC_B(_, _, _))) => 27 
  case CC_D(CC_A(_), _) => 28 
  case CC_D(CC_B(true, CC_A(_), CC_A(_)), _) => 29 
  case CC_D(CC_B(false, CC_A(_), CC_A(_)), _) => 30 
  case CC_D(CC_B(true, CC_A(_), CC_B(_, _, _)), _) => 31 
  case CC_D(CC_B(false, CC_A(_), CC_B(_, _, _)), _) => 32 
  case CC_E() => 33 
}
}