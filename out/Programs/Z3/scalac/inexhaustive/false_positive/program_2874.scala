package Program_31 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_A], b: T_A) extends T_A
case class CC_B(a: T_B[Byte, T_A], b: T_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: T_A, b: C) extends T_B[T_B[T_A, CC_B], CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_C(CC_A(_, _)) => 2 
  case CC_C(CC_B(_, _)) => 3 
  case CC_C(CC_C(_)) => 4 
}
}
// This is not matched: (CC_A Wildcard (CC_C (CC_B Wildcard Wildcard T_A) T_A) T_A)
// This is not matched: (CC_B Wildcard Wildcard (T_B Int))