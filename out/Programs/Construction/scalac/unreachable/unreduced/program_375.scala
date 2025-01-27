package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, T_A[Int, Int]], b: T_A[T_A[Boolean, Byte], T_A[Char, Char]]) extends T_A[T_A[T_A[Byte, Char], T_A[Char, Int]], Byte]
case class CC_B(a: T_A[(CC_A,CC_A), T_A[CC_A, CC_A]]) extends T_A[T_A[T_A[Byte, Char], T_A[Char, Int]], Byte]
case class CC_C() extends T_A[T_A[T_A[Byte, Char], T_A[Char, Int]], Byte]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Char, Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}