package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, Int]], b: T_A) extends T_A
case class CC_B(a: (CC_A,T_A)) extends T_A
case class CC_C(a: CC_A, b: CC_A, c: CC_B) extends T_A
case class CC_D[C](a: C) extends T_B[CC_C, C]
case class CC_E() extends T_B[CC_C, CC_D[(T_A,T_A)]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B((_,_))) => 1 
  case CC_A(_, CC_C(_, _, CC_B(_))) => 2 
  case CC_B((CC_A(_, _),CC_A(_, _))) => 3 
  case CC_B((CC_A(_, _),CC_B(_))) => 4 
  case CC_B((CC_A(_, _),CC_C(_, _, _))) => 5 
  case CC_C(CC_A(_, CC_A(_, _)), CC_A(_, CC_A(_, _)), CC_B((_,_))) => 6 
  case CC_C(CC_A(_, CC_A(_, _)), CC_A(_, CC_B(_)), CC_B((_,_))) => 7 
  case CC_C(CC_A(_, CC_A(_, _)), CC_A(_, CC_C(_, _, _)), CC_B((_,_))) => 8 
  case CC_C(CC_A(_, CC_B(_)), CC_A(_, CC_A(_, _)), CC_B((_,_))) => 9 
  case CC_C(CC_A(_, CC_B(_)), CC_A(_, CC_B(_)), CC_B((_,_))) => 10 
  case CC_C(CC_A(_, CC_B(_)), CC_A(_, CC_C(_, _, _)), CC_B((_,_))) => 11 
  case CC_C(CC_A(_, CC_C(_, _, _)), CC_A(_, CC_A(_, _)), CC_B((_,_))) => 12 
  case CC_C(CC_A(_, CC_C(_, _, _)), CC_A(_, CC_B(_)), CC_B((_,_))) => 13 
  case CC_C(CC_A(_, CC_C(_, _, _)), CC_A(_, CC_C(_, _, _)), CC_B((_,_))) => 14 
}
}