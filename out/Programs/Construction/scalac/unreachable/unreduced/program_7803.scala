package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A, T_B[CC_A, Char]], b: CC_A, c: T_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C]() extends T_B[Int, C]
case class CC_E(a: CC_C, b: (Boolean,(CC_B,CC_B))) extends T_B[Int, T_B[CC_C, Char]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(CC_B(_, _, _))) => 1 
  case CC_B(_, CC_A(_), CC_A(CC_C(_))) => 2 
  case CC_B(_, CC_A(_), CC_B(_, _, CC_A(_))) => 3 
  case CC_B(_, CC_A(_), CC_B(_, _, CC_B(_, _, _))) => 4 
  case CC_B(_, CC_A(_), CC_B(_, _, CC_C(_))) => 5 
  case CC_B(_, CC_A(_), CC_C(CC_B(_, _, _))) => 6 
  case CC_C(_) => 7 
}
}
// This is not matched: CC_B(_, CC_A(_), CC_A(CC_A(_)))