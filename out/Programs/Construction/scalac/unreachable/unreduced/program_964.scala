package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[(Byte,Int), T_A[Byte, Boolean]]]
case class CC_B(a: T_A[CC_A[Char], T_A[Boolean, Boolean]]) extends T_A[Byte, T_A[(Byte,Int), T_A[Byte, Boolean]]]
case class CC_C[D](a: Int) extends T_A[D, T_A[(Byte,Int), T_A[Byte, Boolean]]]

val v_a: T_A[Byte, T_A[(Byte,Int), T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(12) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_)