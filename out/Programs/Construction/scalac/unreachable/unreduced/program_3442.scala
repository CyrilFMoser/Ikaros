package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[Int, (T_B,T_A[T_B, T_B])]
case class CC_B(a: T_B) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[CC_A, T_B], b: CC_B, c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C())) => 1 
  case CC_B(CC_B(CC_D(_, _, _))) => 2 
  case CC_B(CC_C()) => 3 
  case CC_B(CC_D(_, CC_B(_), _)) => 4 
  case CC_C() => 5 
  case CC_D(_, CC_B(CC_B(_)), CC_B(CC_B(_))) => 6 
  case CC_D(_, CC_B(CC_B(_)), CC_B(CC_C())) => 7 
  case CC_D(_, CC_B(CC_B(_)), CC_B(CC_D(_, _, _))) => 8 
  case CC_D(_, CC_B(CC_B(_)), CC_C()) => 9 
  case CC_D(_, CC_B(CC_B(_)), CC_D(_, CC_B(_), CC_B(_))) => 10 
  case CC_D(_, CC_B(CC_B(_)), CC_D(_, CC_B(_), CC_C())) => 11 
  case CC_D(_, CC_B(CC_B(_)), CC_D(_, CC_B(_), CC_D(_, _, _))) => 12 
  case CC_D(_, CC_B(CC_C()), CC_B(CC_B(_))) => 13 
  case CC_D(_, CC_B(CC_C()), CC_B(CC_C())) => 14 
  case CC_D(_, CC_B(CC_C()), CC_B(CC_D(_, _, _))) => 15 
  case CC_D(_, CC_B(CC_C()), CC_C()) => 16 
  case CC_D(_, CC_B(CC_C()), CC_D(_, CC_B(_), CC_B(_))) => 17 
  case CC_D(_, CC_B(CC_C()), CC_D(_, CC_B(_), CC_C())) => 18 
  case CC_D(_, CC_B(CC_C()), CC_D(_, CC_B(_), CC_D(_, _, _))) => 19 
  case CC_D(_, CC_B(CC_D(_, _, _)), CC_B(CC_B(_))) => 20 
  case CC_D(_, CC_B(CC_D(_, _, _)), CC_B(CC_C())) => 21 
  case CC_D(_, CC_B(CC_D(_, _, _)), CC_B(CC_D(_, _, _))) => 22 
  case CC_D(_, CC_B(CC_D(_, _, _)), CC_C()) => 23 
  case CC_D(_, CC_B(CC_D(_, _, _)), CC_D(_, CC_B(_), CC_B(_))) => 24 
  case CC_D(_, CC_B(CC_D(_, _, _)), CC_D(_, CC_B(_), CC_C())) => 25 
  case CC_D(_, CC_B(CC_D(_, _, _)), CC_D(_, CC_B(_), CC_D(_, _, _))) => 26 
}
}