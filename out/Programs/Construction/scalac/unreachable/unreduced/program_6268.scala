package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[(T_A[Char, Int],(Char,Boolean)), C]
case class CC_B[D](a: CC_A[D], b: Byte, c: D) extends T_A[(T_A[Char, Int],(Char,Boolean)), D]

val v_a: T_A[(T_A[Char, Int],(Char,Boolean)), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}