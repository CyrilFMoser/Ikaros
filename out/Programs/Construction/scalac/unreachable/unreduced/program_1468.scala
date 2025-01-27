package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Char, T_A], Byte], b: T_B[T_A, T_B[Boolean, T_A]], c: (T_B[T_A, T_A],T_A)) extends T_A
case class CC_B(a: (T_A,CC_A), b: T_A, c: T_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: T_A) extends T_B[C, (CC_B,CC_A)]
case class CC_E[D](a: CC_D[D]) extends T_B[D, (CC_B,CC_A)]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_B(_, CC_B(_, _, _), CC_A(_, _, _)) => 1 
  case CC_B(_, CC_C(_), CC_A(_, _, _)) => 2 
  case CC_B(_, CC_A(_, _, _), CC_B(_, _, _)) => 3 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 4 
  case CC_B(_, CC_C(_), CC_B(_, _, _)) => 5 
  case CC_B(_, CC_A(_, _, _), CC_C(_)) => 6 
  case CC_B(_, CC_B(_, _, _), CC_C(_)) => 7 
  case CC_B(_, CC_C(_), CC_C(_)) => 8 
}
}