package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: Int) extends T_A
case class CC_C(a: T_B[T_B[CC_A]], b: T_A) extends T_B[CC_A]
case class CC_D(a: CC_B, b: T_A, c: CC_C) extends T_B[CC_A]
case class CC_E(a: CC_B, b: T_A, c: (CC_A,CC_C)) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, CC_A(CC_A(_)), CC_C(_, CC_A(_))) => 1 
  case CC_D(_, CC_A(CC_B(_, _)), CC_C(_, CC_A(_))) => 2 
  case CC_D(_, CC_B(_, _), CC_C(_, CC_A(_))) => 3 
  case CC_D(_, CC_A(CC_A(_)), CC_C(_, CC_B(_, _))) => 4 
  case CC_D(_, CC_A(CC_B(_, _)), CC_C(_, CC_B(_, _))) => 5 
  case CC_E(CC_B(CC_A(_), _), _, _) => 6 
}
}
// This is not matched: CC_D(_, CC_B(_, _), CC_C(_, CC_B(_, _)))