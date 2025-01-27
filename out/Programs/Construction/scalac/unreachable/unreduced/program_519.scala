package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: T_A[T_A[C, C], C]) extends T_A[C, T_A[T_A[Int, Char], T_A[Int, (Char,Int)]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Int, Char], T_A[Int, (Char,Int)]]]

val v_a: T_A[Boolean, T_A[T_A[Int, Char], T_A[Int, (Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}