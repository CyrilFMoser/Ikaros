package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C[C](a: T_B[C, Int], b: C, c: T_B[C, C]) extends T_B[C, Int]
case class CC_D[D](a: Int, b: T_B[D, Int]) extends T_B[D, Int]
case class CC_E[E](a: T_A, b: T_A) extends T_B[E, Int]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, _), 0, _) => 0 
  case CC_C(CC_C(_, _, _), _, _) => 1 
  case CC_C(CC_D(_, _), 0, _) => 2 
  case CC_C(CC_E(_, _), 0, _) => 3 
  case CC_C(CC_E(_, _), _, _) => 4 
  case CC_D(_, _) => 5 
  case CC_E(_, _) => 6 
}
}
// This is not matched: CC_C(CC_D(_, _), _, _)