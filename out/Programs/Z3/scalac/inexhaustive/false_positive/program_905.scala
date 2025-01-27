package Program_27 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B[B](a: T_A[B]) extends T_A[B]
case class CC_C(a: T_A[Byte]) extends T_B
case class CC_D[C](a: C) extends T_B
case class CC_E(a: T_B, b: CC_B[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_C(_) => 1 
  case CC_E(CC_E(_, _), CC_B(_)) => 2 
  case CC_E(_, CC_B(_)) => 3 
  case CC_E(CC_D(_), CC_B(_)) => 4 
}
}
// This is not matched: (CC_D Boolean Boolean T_B)
// This is not matched: (CC_A Int
//      (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Int
//           (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))))