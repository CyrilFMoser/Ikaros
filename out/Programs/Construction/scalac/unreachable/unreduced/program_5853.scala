package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[T_B[Byte]], c: T_B[T_A]) extends T_A
case class CC_C(a: Byte, b: CC_A, c: CC_B) extends T_A
case class CC_D(a: T_B[CC_B]) extends T_B[CC_B]
case class CC_E(a: Int, b: T_B[CC_B], c: ((CC_C,CC_B),T_A)) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(CC_A(), _, _), _, _) => 1 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 2 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, _) => 3 
  case CC_B(CC_C(_, _, _), _, _) => 4 
  case CC_C(0, CC_A(), CC_B(_, _, _)) => 5 
  case CC_C(_, CC_A(), CC_B(_, _, _)) => 6 
}
}
// This is not matched: CC_B(CC_A(), _, _)