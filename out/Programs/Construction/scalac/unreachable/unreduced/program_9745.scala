package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: Byte, b: CC_A) extends T_A[Char]
case class CC_C(a: Byte, b: CC_B, c: T_A[T_A[Char]]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_C(_, CC_B(_, CC_A()), _) => 2 
}
}