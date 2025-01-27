package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Int,Boolean), (Byte,Char)], T_A[Int, Int]], b: T_A[T_A[Boolean, Byte], T_A[Byte, Int]], c: T_A[Boolean, (Char,Int)]) extends T_A[Boolean, Byte]
case class CC_B(a: Byte, b: Boolean, c: Byte) extends T_A[Boolean, Byte]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}