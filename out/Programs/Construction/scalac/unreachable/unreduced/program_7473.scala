package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A
case class CC_B(a: T_A, b: T_A, c: T_B[CC_A[T_A]]) extends T_A
case class CC_C(a: T_B[Char], b: Byte, c: T_B[Char]) extends T_B[Char]
case class CC_D() extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(CC_A(), CC_B(_, _, _), _), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(), _), _, _) => 3 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _, _) => 4 
}
}
// This is not matched: CC_B(CC_B(CC_A(), CC_A(), _), _, _)