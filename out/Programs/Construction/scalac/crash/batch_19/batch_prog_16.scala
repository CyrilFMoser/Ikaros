package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A, c: Char) extends T_A
case class CC_C[B](a: CC_A, b: B, c: B) extends T_A
case class CC_D[C]() extends T_B[C]
case class CC_E[D](a: T_B[D]) extends T_B[D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
  case CC_B(CC_A(), CC_B(_, CC_A(), _), _) => 2 
  case CC_B(CC_A(), CC_B(_, CC_B(_, _, _), _), _) => 3 
  case CC_B(CC_A(), CC_B(_, CC_C(_, _, _), _), _) => 4 
  case CC_B(CC_A(), CC_C(CC_A(), _, _), _) => 5 
  case CC_C(_, _, _) => 6 
}
}