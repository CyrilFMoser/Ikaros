package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Int]], C]
case class CC_B(a: T_A[CC_A[Boolean], CC_A[(Char,Int)]], b: T_A[CC_A[Byte], T_A[Int, Int]], c: CC_A[CC_A[Byte]]) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Int]], Int]
case class CC_C[D](a: D) extends T_A[T_A[T_A[Boolean, Int], T_A[Int, Int]], D]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Int, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_A(_)) => 1 
  case CC_C(_) => 2 
}
}