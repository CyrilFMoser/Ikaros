package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_A) extends T_A
case class CC_B(a: T_B[T_B[Byte]], b: Byte, c: T_A) extends T_A
case class CC_C(a: CC_A, b: CC_B) extends T_A
case class CC_D() extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]
case class CC_F(a: Byte, b: T_A) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _))) => 2 
  case CC_A(_, CC_B(_, _, CC_A(_, _))) => 3 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _))) => 4 
  case CC_A(_, CC_B(_, _, CC_C(_, _))) => 5 
  case CC_A(_, CC_C(_, CC_B(_, _, _))) => 6 
  case CC_B(_, _, CC_A(12, CC_A(_, _))) => 7 
  case CC_B(_, _, CC_A(12, CC_B(_, _, _))) => 8 
  case CC_B(_, _, CC_A(12, CC_C(_, _))) => 9 
  case CC_B(_, _, CC_A(_, CC_A(_, _))) => 10 
  case CC_B(_, _, CC_A(_, CC_B(_, _, _))) => 11 
  case CC_B(_, _, CC_A(_, CC_C(_, _))) => 12 
  case CC_B(_, _, CC_B(_, _, _)) => 13 
  case CC_B(_, _, CC_C(CC_A(_, _), CC_B(_, _, _))) => 14 
  case CC_C(CC_A(_, CC_A(_, _)), CC_B(_, _, _)) => 15 
  case CC_C(CC_A(_, CC_B(_, _, _)), CC_B(_, _, _)) => 16 
  case CC_C(CC_A(_, CC_C(_, _)), CC_B(_, _, _)) => 17 
}
}