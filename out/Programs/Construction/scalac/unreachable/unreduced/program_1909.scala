package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_A) extends T_A
case class CC_B(a: T_B[CC_A, T_B[CC_A, CC_A]], b: T_B[T_A, Char], c: T_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: C) extends T_B[CC_B, C]
case class CC_E[D](a: D, b: (CC_A,T_B[CC_B, CC_A]), c: CC_C) extends T_B[CC_B, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_))) => 2 
  case CC_A(_, CC_B(_, _, _)) => 3 
  case CC_A(_, CC_C(CC_A(_, _))) => 4 
  case CC_A(_, CC_C(CC_B(_, _, _))) => 5 
  case CC_A(_, CC_C(CC_C(_))) => 6 
  case CC_B(_, _, CC_A(_, CC_A(_, _))) => 7 
  case CC_B(_, _, CC_A(_, CC_B(_, _, _))) => 8 
  case CC_B(_, _, CC_A(_, CC_C(_))) => 9 
  case CC_B(_, _, CC_B(_, _, _)) => 10 
  case CC_B(_, _, CC_C(CC_A(_, _))) => 11 
  case CC_B(_, _, CC_C(CC_B(_, _, _))) => 12 
  case CC_B(_, _, CC_C(CC_C(_))) => 13 
  case CC_C(CC_A(_, CC_A(_, _))) => 14 
  case CC_C(CC_A(_, CC_B(_, _, _))) => 15 
  case CC_C(CC_A(_, CC_C(_))) => 16 
  case CC_C(CC_B(_, _, CC_A(_, _))) => 17 
  case CC_C(CC_B(_, _, CC_B(_, _, _))) => 18 
  case CC_C(CC_B(_, _, CC_C(_))) => 19 
  case CC_C(CC_C(CC_A(_, _))) => 20 
  case CC_C(CC_C(CC_B(_, _, _))) => 21 
  case CC_C(CC_C(CC_C(_))) => 22 
}
}