package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Boolean], Char]) extends T_A[T_A[T_B[Boolean, Byte]]]
case class CC_B[D](a: T_A[D], b: T_B[D, Char]) extends T_B[D, Char]
case class CC_C(a: CC_A) extends T_B[Byte, Char]

val v_a: T_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C(_)) => 0 
  case CC_C(CC_A(_)) => 1 
}
}
// This is not matched: CC_B(_, CC_B(_, _))