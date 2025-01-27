package Program_31 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: T_B[Char, Byte], b: T_B[Byte, T_A]) extends T_A
case class CC_C[E, D](a: E, b: E, c: CC_B) extends T_B[D, E]

val v_a: CC_C[T_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(), _) => 0 
  case CC_C(CC_B(_, _), CC_B(_, _), CC_B(_, _)) => 1 
  case CC_C(CC_A(), _, CC_B(_, _)) => 2 
  case CC_C(_, CC_A(), CC_B(_, _)) => 3 
  case CC_C(CC_B(_, _), _, _) => 4 
  case CC_C(CC_A(), CC_A(), CC_B(_, _)) => 5 
  case CC_C(CC_A(), CC_B(_, _), CC_B(_, _)) => 6 
  case CC_C(CC_B(_, _), CC_A(), _) => 7 
}
}
// This is not matched: (CC_C T_A
//      (CC_B T_A (T_B T_A T_A) T_A)
//      (CC_A T_A T_A)
//      (CC_B (CC_C Byte Char Byte Byte Wildcard (T_B Char Byte)) Wildcard T_A)
//      Wildcard
//      (T_B (CC_B T_A (T_B T_A T_A) T_A) T_A))
// This is not matched: (CC_A T_A)