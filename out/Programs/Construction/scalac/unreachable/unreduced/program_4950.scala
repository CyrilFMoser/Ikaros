package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: T_A[T_A[Int, Byte], T_A[Char, Boolean]]) extends T_A[Byte, Char]
case class CC_B[C](a: CC_A) extends T_A[Byte, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}