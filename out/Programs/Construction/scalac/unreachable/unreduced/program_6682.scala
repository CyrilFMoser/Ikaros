package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], Byte], b: T_A) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C(a: CC_A, b: Boolean, c: CC_B) extends T_A
case class CC_D[C](a: CC_B, b: C, c: CC_B) extends T_B[CC_B, C]
case class CC_E[D]() extends T_B[CC_B, D]

val v_a: T_B[CC_B, T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_B('x'), CC_A(_, CC_A(_, _)), CC_B(_)) => 0 
  case CC_D(CC_B('x'), CC_A(_, CC_B(_)), CC_B(_)) => 1 
  case CC_D(CC_B('x'), CC_A(_, CC_C(_, _, _)), CC_B(_)) => 2 
  case CC_D(CC_B('x'), CC_B(_), CC_B(_)) => 3 
  case CC_D(CC_B('x'), CC_C(_, _, _), CC_B(_)) => 4 
  case CC_D(CC_B(_), CC_A(_, CC_A(_, _)), CC_B(_)) => 5 
  case CC_D(CC_B(_), CC_A(_, CC_B(_)), CC_B(_)) => 6 
  case CC_D(CC_B(_), CC_A(_, CC_C(_, _, _)), CC_B(_)) => 7 
  case CC_D(CC_B(_), CC_B(_), CC_B(_)) => 8 
  case CC_D(CC_B(_), CC_C(_, _, _), CC_B(_)) => 9 
  case CC_E() => 10 
}
}