package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: Boolean, c: C) extends T_A[C, Byte]
case class CC_B(a: T_A[T_A[Int, Byte], T_A[Byte, Byte]], b: T_A[T_A[Int, Byte], T_A[Int, Byte]]) extends T_A[CC_A[T_A[Char, Char]], Byte]

val v_a: T_A[CC_A[T_A[Char, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}