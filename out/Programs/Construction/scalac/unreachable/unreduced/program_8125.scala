package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A, c: Byte) extends T_A
case class CC_C(a: CC_A, b: Int, c: T_B[T_A, T_B[CC_A, CC_B]]) extends T_A
case class CC_D[C, D](a: (CC_A,CC_C), b: D) extends T_B[Char, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(CC_A(), CC_A(), 0), _, _) => 2 
  case CC_B(CC_B(CC_A(), CC_A(), _), _, _) => 3 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(), 0), _, _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(), _), _, _) => 5 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(), 0), _, _) => 6 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(), _), _, _) => 7 
  case CC_B(CC_B(CC_A(), CC_B(_, _, _), 0), _, _) => 8 
  case CC_B(CC_B(CC_A(), CC_B(_, _, _), _), _, _) => 9 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), 0), _, _) => 10 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _, _) => 11 
  case CC_B(CC_B(CC_C(_, _, _), CC_B(_, _, _), 0), _, _) => 12 
  case CC_B(CC_B(CC_C(_, _, _), CC_B(_, _, _), _), _, _) => 13 
  case CC_B(CC_B(CC_A(), CC_C(_, _, _), 0), _, _) => 14 
  case CC_B(CC_B(CC_A(), CC_C(_, _, _), _), _, _) => 15 
  case CC_B(CC_B(CC_B(_, _, _), CC_C(_, _, _), 0), _, _) => 16 
  case CC_B(CC_B(CC_B(_, _, _), CC_C(_, _, _), _), _, _) => 17 
  case CC_B(CC_B(CC_C(_, _, _), CC_C(_, _, _), 0), _, _) => 18 
  case CC_B(CC_B(CC_C(_, _, _), CC_C(_, _, _), _), _, _) => 19 
  case CC_B(CC_C(_, _, _), _, _) => 20 
  case CC_C(_, _, _) => 21 
}
}