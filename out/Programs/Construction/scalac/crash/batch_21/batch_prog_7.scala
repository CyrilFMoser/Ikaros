package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: ((T_A,T_A),T_B[T_A, T_A])) extends T_A
case class CC_B(a: T_B[T_B[CC_A, Byte], T_B[CC_A, CC_A]], b: T_A, c: Int) extends T_A
case class CC_C[C](a: C, b: CC_B) extends T_A
case class CC_D[D, E](a: CC_B) extends T_B[E, D]
case class CC_E[F, G]() extends T_B[F, G]
case class CC_F() extends T_B[T_B[Byte, T_A], T_B[CC_C[CC_A], CC_C[CC_B]]]

val v_a: T_B[Byte, T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_D(_), CC_A(_), 12)) => 0 
  case CC_D(CC_B(CC_D(_), CC_A(_), _)) => 1 
  case CC_D(CC_B(CC_D(_), CC_B(_, _, _), 12)) => 2 
  case CC_D(CC_B(CC_D(_), CC_B(_, _, _), _)) => 3 
  case CC_D(CC_B(CC_D(_), CC_C(_, _), 12)) => 4 
  case CC_D(CC_B(CC_D(_), CC_C(_, _), _)) => 5 
  case CC_D(CC_B(CC_E(), CC_A(_), 12)) => 6 
  case CC_D(CC_B(CC_E(), CC_A(_), _)) => 7 
  case CC_D(CC_B(CC_E(), CC_B(_, _, _), 12)) => 8 
  case CC_D(CC_B(CC_E(), CC_B(_, _, _), _)) => 9 
  case CC_D(CC_B(CC_E(), CC_C(_, _), 12)) => 10 
  case CC_D(CC_B(CC_E(), CC_C(_, _), _)) => 11 
  case CC_E() => 12 
}
}