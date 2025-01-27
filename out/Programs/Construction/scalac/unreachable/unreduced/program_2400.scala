package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[Byte]) extends T_A[Char]
case class CC_B(a: Boolean, b: Int) extends T_A[Char]
case class CC_C(a: CC_B, b: CC_A, c: CC_B) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B(_, _), CC_A(_, _), _) => 2 
}
}