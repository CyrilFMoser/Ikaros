package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[(T_A,T_A)]) extends T_A
case class CC_C(a: T_B[CC_B], b: T_B[Char]) extends T_B[Char]
case class CC_D(a: T_A) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C(_, CC_D(_))