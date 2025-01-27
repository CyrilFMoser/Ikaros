package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[(Byte,Char)]]) extends T_A
case class CC_B(a: T_B[T_B[CC_A]], b: T_A, c: CC_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: CC_C) extends T_B[T_B[(CC_C,CC_B)]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
  case CC_B(_, CC_B(_, CC_A(_), CC_A(_)), CC_A(_)) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_)), CC_A(_)) => 3 
  case CC_B(_, CC_B(_, CC_C(_), CC_A(_)), CC_A(_)) => 4 
  case CC_B(_, CC_C(CC_A(_)), CC_A(_)) => 5 
  case CC_B(_, CC_C(CC_B(_, _, _)), CC_A(_)) => 6 
  case CC_B(_, CC_C(CC_C(_)), CC_A(_)) => 7 
  case CC_C(CC_A(_)) => 8 
  case CC_C(CC_B(_, _, _)) => 9 
  case CC_C(CC_C(CC_A(_))) => 10 
  case CC_C(CC_C(CC_B(_, _, _))) => 11 
  case CC_C(CC_C(CC_C(_))) => 12 
}
}