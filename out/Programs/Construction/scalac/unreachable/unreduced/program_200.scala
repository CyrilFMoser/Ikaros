package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C) extends T_A[(T_A[Int, Int],T_A[Int, Char]), C]
case class CC_B(a: CC_A[CC_A[Int]], b: CC_A[Int], c: CC_A[T_A[Char, Int]]) extends T_A[(T_A[Int, Int],T_A[Int, Char]), (T_A[Int, Boolean],T_A[Char, Int])]
case class CC_C(a: Boolean) extends T_A[(T_A[Int, Int],T_A[Int, Char]), (T_A[Int, Boolean],T_A[Char, Int])]

val v_a: T_A[(T_A[Int, Int],T_A[Int, Char]), (T_A[Int, Boolean],T_A[Char, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}