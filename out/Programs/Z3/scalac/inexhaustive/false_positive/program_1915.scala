package Program_27 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_B, b: T_B) extends T_A
case class CC_C(a: (Int,CC_B), b: CC_A) extends T_A
case class CC_D(a: T_B) extends T_B
case class CC_E(a: T_B, b: Char) extends T_B
case class CC_F[A](a: A, b: A) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_F(_, _), CC_D(_)) => 1 
  case CC_B(_, CC_F(_, _)) => 2 
  case CC_B(CC_D(_), CC_D(_)) => 3 
  case CC_B(CC_E(_, _), CC_D(_)) => 4 
  case CC_B(_, CC_E(_, _)) => 5 
  case CC_B(_, CC_D(_)) => 6 
  case CC_B(CC_F(_, _), CC_F(_, _)) => 7 
  case CC_B(CC_F(_, _), _) => 8 
  case CC_C((12,CC_B(_, _)), _) => 9 
  case CC_C((_,CC_B(_, _)), _) => 10 
  case CC_C(_, CC_A()) => 11 
}
}
// This is not matched: (CC_B (CC_F Boolean Boolean Boolean T_B) (CC_F Boolean Boolean Boolean T_B) T_A)
// This is not matched: (CC_C T_A)