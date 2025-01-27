package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[Char]
case class CC_B(a: T_A[Boolean], b: T_B) extends T_A[Char]
case class CC_C(a: Char, b: T_B, c: T_A[Char]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_C(_, CC_C(_, _, _), CC_A(_, _))) => 1 
  case CC_B(_, CC_C(_, CC_D(), CC_A(_, _))) => 2 
  case CC_B(_, CC_C(_, CC_C(_, _, _), CC_B(_, _))) => 3 
  case CC_B(_, CC_C(_, CC_D(), CC_B(_, _))) => 4 
}
}
// This is not matched: CC_B(_, CC_D())