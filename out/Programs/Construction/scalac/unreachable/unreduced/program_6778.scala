package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, (T_B,T_B)]
case class CC_B[D](a: T_A[D, D], b: T_A[D, (T_B,T_B)]) extends T_A[D, (T_B,T_B)]
case class CC_C(a: T_A[T_B, (T_B,T_B)], b: CC_A[T_A[T_B, (Int,Char)]], c: (T_B,T_A[T_B, T_B])) extends T_B
case class CC_D[E](a: T_B, b: CC_A[E], c: (T_A[T_B, T_B],Boolean)) extends T_B
case class CC_E(a: Char, b: CC_B[CC_D[T_B]], c: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), CC_A(_), (CC_C(_, _, _),_)) => 0 
  case CC_C(CC_B(_, CC_A(_)), CC_A(_), (CC_C(_, _, _),_)) => 1 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(_), (CC_C(_, _, _),_)) => 2 
  case CC_C(CC_A(_), CC_A(_), (CC_D(_, _, _),_)) => 3 
  case CC_C(CC_B(_, CC_A(_)), CC_A(_), (CC_D(_, _, _),_)) => 4 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(_), (CC_D(_, _, _),_)) => 5 
  case CC_C(CC_A(_), CC_A(_), (CC_E(_, _, _),_)) => 6 
  case CC_C(CC_B(_, CC_A(_)), CC_A(_), (CC_E(_, _, _),_)) => 7 
  case CC_C(CC_B(_, CC_B(_, _)), CC_A(_), (CC_E(_, _, _),_)) => 8 
  case CC_D(_, _, _) => 9 
  case CC_E(_, CC_B(_, CC_A(_)), _) => 10 
  case CC_E(_, CC_B(_, CC_B(_, _)), _) => 11 
}
}