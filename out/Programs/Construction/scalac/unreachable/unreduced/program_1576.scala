package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Byte, b: CC_A[D]) extends T_A[D, T_A[D, D]]
case class CC_C(a: Int, b: Int) extends T_A[(CC_A[Byte],CC_B[(Boolean,Int)]), T_A[(CC_A[Byte],CC_B[(Boolean,Int)]), (CC_A[Byte],CC_B[(Boolean,Int)])]]

val v_a: T_A[CC_C, T_A[CC_C, CC_C]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}