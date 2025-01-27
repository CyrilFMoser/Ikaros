package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Char, T_B]) extends T_A[Char, C]
case class CC_B(a: T_A[((Char,Boolean),T_B), (T_B,Int)], b: T_B) extends T_B
case class CC_C(a: Byte) extends T_B
case class CC_D(a: (T_B,Boolean), b: CC_A[T_A[Char, Char]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(_, CC_A(_)) => 1 
}
}
// This is not matched: CC_C(_)