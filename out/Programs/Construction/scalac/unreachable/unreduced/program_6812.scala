package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: Boolean, c: T_B[T_A, T_A]) extends T_A
case class CC_C(a: (T_A,CC_B), b: T_A) extends T_A
case class CC_D[C]() extends T_B[C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(CC_A(), _, _), _, _) => 2 
  case CC_B(CC_B(CC_C(_, _), _, _), _, _) => 3 
  case CC_B(CC_C(_, CC_A()), _, _) => 4 
  case CC_B(CC_C(_, CC_B(_, _, _)), _, _) => 5 
  case CC_B(CC_C(_, CC_C(_, _)), _, _) => 6 
  case CC_C((CC_A(),CC_B(_, _, _)), _) => 7 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), _) => 8 
  case CC_C((CC_C(_, _),CC_B(_, _, _)), _) => 9 
}
}
// This is not matched: CC_B(CC_B(CC_B(_, _, _), _, _), _, _)