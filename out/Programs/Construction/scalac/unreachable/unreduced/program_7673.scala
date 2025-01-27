package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[(Char,Int), T_A[Char, Byte]], Byte]
case class CC_B(a: T_A[Int, CC_A]) extends T_A[T_A[(Char,Int), T_A[Char, Byte]], Byte]
case class CC_C(a: Byte, b: Char) extends T_A[T_A[(Char,Int), T_A[Char, Byte]], Byte]

val v_a: T_A[T_A[(Char,Int), T_A[Char, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}