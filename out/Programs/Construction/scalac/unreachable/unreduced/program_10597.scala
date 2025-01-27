package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Boolean, c: T_A[C, C]) extends T_A[C, ((Int,Int),T_A[Byte, Byte])]
case class CC_B[D](a: CC_A[D], b: Char, c: Int) extends T_A[D, ((Int,Int),T_A[Byte, Byte])]

val v_a: T_A[Int, ((Int,Int),T_A[Byte, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}