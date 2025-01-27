package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[Int, (Char,Char)], T_A[Char, (Int,Int)]]]
case class CC_B[D](a: T_A[CC_A[D], D], b: D) extends T_A[D, T_A[T_A[Int, (Char,Char)], T_A[Char, (Int,Int)]]]
case class CC_C(a: CC_B[Char], b: Byte) extends T_A[(Char,T_A[Int, (Char,Int)]), T_A[T_A[Int, (Char,Char)], T_A[Char, (Int,Int)]]]

val v_a: T_A[(Char,T_A[Int, (Char,Int)]), T_A[T_A[Int, (Char,Char)], T_A[Char, (Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}