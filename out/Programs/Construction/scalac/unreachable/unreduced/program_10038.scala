package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A], c: T_B[T_A]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_B, b: CC_B) extends T_A
case class CC_D(a: CC_C) extends T_B[T_B[T_B[CC_C]]]
case class CC_E(a: CC_A, b: T_A, c: CC_D) extends T_B[T_B[T_B[CC_C]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_), _, _), _, _) => 1 
  case CC_A(CC_A(CC_C(_, _), _, _), _, _) => 2 
  case CC_A(CC_B(CC_A(_, _, _)), _, _) => 3 
  case CC_A(CC_B(CC_B(_)), _, _) => 4 
  case CC_A(CC_B(CC_C(_, _)), _, _) => 5 
  case CC_A(CC_C(CC_B(_), CC_B(_)), _, _) => 6 
  case CC_B(_) => 7 
  case CC_C(_, _) => 8 
}
}