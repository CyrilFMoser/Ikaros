package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, (Int,Int)]], C]
case class CC_B(a: (Byte,T_A[Int, Byte])) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, (Int,Int)]], Boolean]
case class CC_C[D](a: D) extends T_A[T_A[T_A[Int, Char], T_A[Boolean, (Int,Int)]], CC_A[CC_B]]

val v_a: T_A[T_A[T_A[Int, Char], T_A[Boolean, (Int,Int)]], CC_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_) => 1 
}
}