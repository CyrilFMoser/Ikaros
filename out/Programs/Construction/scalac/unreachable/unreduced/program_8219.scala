package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C], c: T_A[C, C]) extends T_A[(T_A[Char, Int],((Int,Int),Char)), C]
case class CC_B[D](a: D) extends T_A[(T_A[Char, Int],((Int,Int),Char)), D]

val v_a: T_A[(T_A[Char, Int],((Int,Int),Char)), Byte] = null
val v_b: Int = v_a match{
  case CC_A('x', _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_) => 2 
}
}