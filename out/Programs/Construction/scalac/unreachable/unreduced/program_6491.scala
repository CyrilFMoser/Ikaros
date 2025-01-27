package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Int, Int], T_A[Byte, Int]], Byte]
case class CC_B(a: Char, b: CC_A, c: T_A[Int, T_A[CC_A, CC_A]]) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Int]], Byte]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Byte, Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}