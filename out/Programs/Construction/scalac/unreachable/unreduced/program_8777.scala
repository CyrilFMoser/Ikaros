package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Char, b: T_A, c: T_B[CC_A, T_B[T_A, T_A]]) extends T_A
case class CC_D[C](a: CC_A, b: Char) extends T_B[C, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_C(_, CC_A(), _)) => 2 
  case CC_B(CC_C(_, CC_B(_), _)) => 3 
  case CC_B(CC_C(_, CC_C(_, _, _), _)) => 4 
  case CC_C(_, _, _) => 5 
}
}
// This is not matched: CC_B(CC_A())