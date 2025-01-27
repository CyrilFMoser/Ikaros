package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[T_A[C, C], T_A[Char, C]], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[T_A[D, D], T_A[Char, D]], D]
case class CC_C(a: T_A[T_A[Int, Char], CC_A[Boolean]]) extends T_A[T_A[T_A[CC_B[T_A[Int, (Int,Char)]], CC_B[T_A[Int, (Int,Char)]]], T_A[Char, CC_B[T_A[Int, (Int,Char)]]]], CC_B[T_A[Int, (Int,Char)]]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}