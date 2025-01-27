package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[T_A]], b: T_A, c: T_A) extends T_A
case class CC_C(a: CC_A, b: T_B[Char]) extends T_A
case class CC_D(a: CC_B, b: T_B[CC_B]) extends T_B[CC_B]
case class CC_E(a: CC_B, b: CC_C) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_B(_, CC_A(), CC_A()), CC_C(_, _)) => 1 
  case CC_E(CC_B(_, CC_B(_, _, _), CC_A()), CC_C(_, _)) => 2 
  case CC_E(CC_B(_, CC_C(_, _), CC_A()), CC_C(_, _)) => 3 
  case CC_E(CC_B(_, CC_A(), CC_B(_, _, _)), CC_C(_, _)) => 4 
  case CC_E(CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_C(_, _)) => 5 
  case CC_E(CC_B(_, CC_C(_, _), CC_B(_, _, _)), CC_C(_, _)) => 6 
  case CC_E(CC_B(_, CC_A(), CC_C(_, _)), CC_C(_, _)) => 7 
  case CC_E(CC_B(_, CC_B(_, _, _), CC_C(_, _)), CC_C(_, _)) => 8 
}
}
// This is not matched: CC_E(CC_B(_, CC_C(_, _), CC_C(_, _)), CC_C(_, _))