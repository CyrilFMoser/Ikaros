package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: T_A[T_A[Byte, Int], T_A[(Char,Int), Int]]) extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Char]], Byte]
case class CC_B() extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Char]], Byte]
case class CC_C(a: CC_A, b: T_A[T_A[CC_B, CC_B], T_A[CC_A, (Byte,Byte)]]) extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Char]], Byte]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Byte, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}