package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, Char]], b: T_A[C, C]) extends T_A[C, T_A[Int, Int]]
case class CC_B[D]() extends T_A[D, T_A[Int, Int]]
case class CC_C(a: T_A[CC_B[Char], T_A[Int, Int]], b: T_A[T_A[Boolean, Boolean], T_A[Int, Int]], c: T_A[CC_B[Int], T_A[Int, Int]]) extends T_A[((Boolean,Char),(Char,Char)), T_A[Int, Int]]

val v_a: T_A[Boolean, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}