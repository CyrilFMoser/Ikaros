package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[(Int,(Byte,Int)), C]]
case class CC_B[D](a: D, b: Int, c: Byte) extends T_A[D, T_A[(Int,(Byte,Int)), D]]
case class CC_C[E](a: CC_A[E]) extends T_A[E, T_A[(Int,(Byte,Int)), E]]

val v_a: T_A[Boolean, T_A[(Int,(Byte,Int)), Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, _, _)) => 2 
}
}