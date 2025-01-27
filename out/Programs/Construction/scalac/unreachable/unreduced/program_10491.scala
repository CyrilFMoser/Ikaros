package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: D, c: D) extends T_A[T_A[Int, T_A[Boolean, Char]], D]
case class CC_B(a: T_A[CC_A[Boolean], CC_A[Int]]) extends T_A[T_A[Int, T_A[Boolean, Char]], CC_A[T_A[Char, (Boolean,Int)]]]

val v_a: T_A[T_A[Int, T_A[Boolean, Char]], CC_A[T_A[Char, (Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(true, _, _) => 0 
  case CC_A(false, _, _) => 1 
  case CC_B(_) => 2 
}
}