package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A, Byte], b: CC_A, c: T_A) extends T_A
case class CC_C(a: Int, b: CC_A) extends T_A
case class CC_D[C](a: T_A, b: CC_C) extends T_B[Boolean, C]
case class CC_E[D]() extends T_B[Boolean, D]
case class CC_F[E]() extends T_B[Boolean, E]

val v_a: T_B[Boolean, T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _) => 0 
  case CC_D(CC_B(_, CC_A(), CC_B(_, _, _)), _) => 1 
  case CC_D(CC_B(_, CC_A(), CC_C(_, _)), _) => 2 
  case CC_D(CC_C(_, CC_A()), _) => 3 
  case CC_E() => 4 
  case CC_F() => 5 
}
}
// This is not matched: CC_D(CC_B(_, CC_A(), CC_A()), _)