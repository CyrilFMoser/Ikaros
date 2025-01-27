package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[(Boolean,CC_A)], b: CC_A, c: T_A) extends T_A
case class CC_C(a: CC_B, b: Boolean, c: T_B[CC_B]) extends T_A
case class CC_D() extends T_B[Boolean]
case class CC_E(a: T_B[Boolean]) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), CC_A()) => 1 
  case CC_B(_, CC_A(), CC_B(_, CC_A(), CC_B(_, _, _))) => 2 
  case CC_B(_, CC_A(), CC_B(_, CC_A(), CC_C(_, _, _))) => 3 
  case CC_B(_, CC_A(), CC_C(_, _, _)) => 4 
  case CC_C(CC_B(_, CC_A(), CC_A()), true, _) => 5 
  case CC_C(CC_B(_, CC_A(), CC_B(_, _, _)), true, _) => 6 
  case CC_C(CC_B(_, CC_A(), CC_C(_, _, _)), true, _) => 7 
  case CC_C(CC_B(_, CC_A(), CC_A()), false, _) => 8 
  case CC_C(CC_B(_, CC_A(), CC_B(_, _, _)), false, _) => 9 
  case CC_C(CC_B(_, CC_A(), CC_C(_, _, _)), false, _) => 10 
}
}
// This is not matched: CC_B(_, CC_A(), CC_B(_, CC_A(), CC_A()))