package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D], b: T_A[T_A[D, D], D], c: D) extends T_A[T_A[D, D], D]
case class CC_C(a: CC_A[CC_A[Char]]) extends T_A[T_A[CC_B[CC_A[(Int,Byte)]], CC_B[CC_A[(Int,Byte)]]], CC_B[CC_A[(Int,Byte)]]]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, _, _)) => 2 
  case CC_B(_, _, _) => 3 
}
}