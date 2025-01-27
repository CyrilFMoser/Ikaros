package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A], c: T_B[CC_A]) extends T_A
case class CC_C(a: T_B[((Boolean,Char),T_A)], b: (CC_B,CC_A), c: CC_A) extends T_A
case class CC_D(a: CC_C) extends T_B[Char]
case class CC_E(a: T_B[T_A], b: CC_B) extends T_B[Char]
case class CC_F(a: CC_D) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, CC_B(CC_B(_, _, _), _, _)) => 1 
  case CC_E(_, CC_B(CC_C(_, _, _), _, _)) => 2 
  case CC_F(_) => 3 
}
}
// This is not matched: CC_E(_, CC_B(CC_A(_), _, _))