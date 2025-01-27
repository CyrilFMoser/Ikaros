package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: C) extends T_A[B]
case class CC_B[D](a: T_A[D], b: T_A[D]) extends T_A[D]
case class CC_C(a: Boolean, b: T_A[T_B], c: T_A[Boolean]) extends T_B
case class CC_D(a: T_A[(Char,Char)], b: Char) extends T_B
case class CC_E(a: Byte) extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_A(_), CC_B(_, _)) => 2 
  case CC_B(CC_B(_, _), _) => 3 
  case CC_B(_, _) => 4 
  case CC_B(_, CC_B(_, _)) => 5 
  case CC_B(CC_B(_, _), CC_A(_)) => 6 
  case CC_B(_, CC_A(_)) => 7 
}
}
// This is not matched: (CC_A Byte Boolean Boolean (T_A Byte))
// This is not matched: (CC_C Byte (T_A Byte Byte))