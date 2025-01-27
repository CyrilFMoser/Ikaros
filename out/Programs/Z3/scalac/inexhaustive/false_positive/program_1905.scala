package Program_31 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Byte]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C[C, D](a: T_A) extends T_B[C, CC_A]
case class CC_D[E](a: E) extends T_B[E, CC_A]
case class CC_E[F](a: F) extends T_B[F, Char]

val v_a: T_B[Byte, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_C(CC_A(_)) => 1 
  case CC_C(CC_B(_)) => 2 
}
}
// This is not matched: (CC_C Byte T_A (CC_B Wildcard T_A) (T_B Byte (CC_A T_A T_A)))
// This is not matched: (CC_D Char
//      Int
//      (CC_D Int
//            Int
//            (CC_D Int Int Wildcard Wildcard (T_B Int Int))
//            Wildcard
//            (T_B Int Int))
//      (CC_C Char Char Char Char Wildcard (T_B Char Char))
//      (T_B Char Int))