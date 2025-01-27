package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_B[T_A, Int]]) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[C](a: Int, b: Char, c: T_B[C, C]) extends T_B[Boolean, C]
case class CC_E() extends T_B[Boolean, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_B(_, _), _), _) => 0 
  case CC_A(CC_A(CC_C(_), _), _) => 1 
  case CC_A(CC_B(_, _), _) => 2 
  case CC_A(CC_C(_), _) => 3 
  case CC_B(_, _) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_A(CC_A(CC_A(_, _), _), _)