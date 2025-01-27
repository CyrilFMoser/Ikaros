package Program_15 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A]() extends T_A
case class CC_B(a: T_B, b: T_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: CC_B, b: T_A) extends T_B
case class CC_E(a: CC_B) extends T_B
case class CC_F[B]() extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
  case CC_C(CC_C(_)) => 2 
  case CC_B(CC_F(), CC_B(_, _)) => 3 
  case CC_B(CC_D(_, _), CC_B(_, _)) => 4 
  case CC_B(_, _) => 5 
  case CC_B(CC_D(_, _), CC_C(_)) => 6 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A (CC_A (CC_C T_A) Wildcard (CC_C T_A) T_A)
//      (Tuple (CC_B Char Wildcard T_A)
//             (CC_B Char (CC_A (CC_C T_A) Wildcard Wildcard T_A) T_A))
//      Wildcard
//      T_A)