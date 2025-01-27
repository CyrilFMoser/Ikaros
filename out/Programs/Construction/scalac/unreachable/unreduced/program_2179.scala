package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: (Char,T_A[Byte]), c: Char) extends T_A[T_A[(Int,Byte)]]
case class CC_B[B](a: Int, b: T_A[B], c: (Int,T_A[CC_A])) extends T_A[T_A[(Int,Byte)]]
case class CC_C(a: Char) extends T_A[T_A[(Int,Byte)]]

val v_a: T_A[T_A[(Int,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C('x') => 2 
  case CC_C(_) => 3 
}
}