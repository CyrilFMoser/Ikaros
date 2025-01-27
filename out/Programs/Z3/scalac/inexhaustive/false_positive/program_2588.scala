package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B, b: B) extends T_A[B]
case class CC_B[C](a: T_A[C]) extends T_B
case class CC_C(a: Byte, b: T_A[T_B]) extends T_B
case class CC_D(a: T_B, b: CC_A[(Boolean,Boolean)], c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_A(_, _)) => 1 
  case CC_C(0, CC_A(_, _)) => 2 
  case CC_D(CC_D(_, _, _), CC_A(_, _), _) => 3 
  case CC_D(CC_D(_, _, _), CC_A(_, _), CC_C(_, _)) => 4 
  case CC_D(_, _, CC_C(_, _)) => 5 
  case CC_D(CC_C(_, _), CC_A(_, _), _) => 6 
  case CC_D(CC_C(_, _), CC_A(_, _), CC_C(_, _)) => 7 
  case CC_D(CC_B(_), CC_A(_, _), _) => 8 
  case CC_D(_, CC_A(_, _), _) => 9 
  case CC_D(_, _, _) => 10 
  case CC_D(CC_B(_), CC_A(_, _), CC_C(_, _)) => 11 
  case CC_D(CC_C(_, _), _, CC_C(_, _)) => 12 
}
}
// This is not matched: (CC_B T_B (CC_A T_B (CC_B T_B Wildcard T_B) Wildcard (T_A T_B)) T_B)
// This is not matched: (CC_B Byte Int Wildcard (T_A Byte Int))