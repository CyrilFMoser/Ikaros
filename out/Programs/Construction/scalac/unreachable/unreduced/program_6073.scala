package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[(Int,Int), T_A]], b: T_B[T_A, T_A], c: T_A) extends T_A
case class CC_B(a: T_B[CC_A, T_B[CC_A, CC_A]], b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C) extends T_B[T_A, C]
case class CC_E[D](a: T_B[T_A, D]) extends T_B[T_A, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, CC_D(CC_A(_, _, _)), CC_A(_, _, CC_B(_, _))) => 1 
  case CC_A(_, CC_D(CC_A(_, _, _)), CC_A(_, _, CC_C())) => 2 
  case CC_A(_, CC_D(CC_A(_, _, _)), CC_B(_, _)) => 3 
  case CC_A(_, CC_D(CC_A(_, _, _)), CC_C()) => 4 
  case CC_A(_, CC_D(CC_B(_, _)), CC_A(_, _, CC_A(_, _, _))) => 5 
  case CC_A(_, CC_D(CC_B(_, _)), CC_A(_, _, CC_B(_, _))) => 6 
  case CC_A(_, CC_D(CC_B(_, _)), CC_A(_, _, CC_C())) => 7 
  case CC_A(_, CC_D(CC_B(_, _)), CC_B(_, _)) => 8 
  case CC_A(_, CC_D(CC_B(_, _)), CC_C()) => 9 
  case CC_A(_, CC_D(CC_C()), CC_A(_, _, CC_A(_, _, _))) => 10 
  case CC_A(_, CC_D(CC_C()), CC_A(_, _, CC_B(_, _))) => 11 
  case CC_A(_, CC_D(CC_C()), CC_A(_, _, CC_C())) => 12 
  case CC_A(_, CC_D(CC_C()), CC_B(_, _)) => 13 
  case CC_A(_, CC_D(CC_C()), CC_C()) => 14 
  case CC_A(_, CC_E(CC_D(_)), CC_A(_, _, CC_A(_, _, _))) => 15 
  case CC_A(_, CC_E(CC_D(_)), CC_A(_, _, CC_B(_, _))) => 16 
  case CC_A(_, CC_E(CC_D(_)), CC_A(_, _, CC_C())) => 17 
  case CC_A(_, CC_E(CC_D(_)), CC_B(_, _)) => 18 
  case CC_A(_, CC_E(CC_D(_)), CC_C()) => 19 
  case CC_A(_, CC_E(CC_E(_)), CC_A(_, _, CC_A(_, _, _))) => 20 
  case CC_A(_, CC_E(CC_E(_)), CC_A(_, _, CC_B(_, _))) => 21 
  case CC_A(_, CC_E(CC_E(_)), CC_A(_, _, CC_C())) => 22 
  case CC_A(_, CC_E(CC_E(_)), CC_B(_, _)) => 23 
  case CC_A(_, CC_E(CC_E(_)), CC_C()) => 24 
  case CC_B(_, _) => 25 
  case CC_C() => 26 
}
}