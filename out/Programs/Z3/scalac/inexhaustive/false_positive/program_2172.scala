package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Char, Byte], T_A[Byte, Boolean]]
case class CC_B(a: Int, b: T_A[Int, CC_A]) extends T_A[T_A[Char, Byte], T_A[Byte, Boolean]]

val v_a: T_A[T_A[Char, Byte], T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(12, _) => 1 
}
}
// This is not matched: Pattern match is empty without constants