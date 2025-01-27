package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: CC_A, c: Int) extends T_A
case class CC_C(a: Byte, b: T_B[CC_A], c: Int) extends T_A
case class CC_D(a: CC_C) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(CC_A(), CC_A(), 12), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(), 12), _, _) => 3 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(), 12), _, _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(), _), _, _) => 5 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(), _), _, _) => 6 
  case CC_B(CC_C(_, _, _), _, _) => 7 
  case CC_C(_, _, _) => 8 
}
}
// This is not matched: CC_B(CC_B(CC_A(), CC_A(), _), _, _)