package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D]() extends T_A[T_A[(T_A[Char, Char],Int), T_A[(T_A[Char, Char],Int), (T_A[Char, Char],Int)]], (T_A[Char, Char],Int)]
case class CC_C(a: CC_A[CC_A[Char]], b: T_A[T_A[Int, Byte], CC_B[Boolean]]) extends T_A[T_A[(T_A[Char, Char],Int), T_A[(T_A[Char, Char],Int), (T_A[Char, Char],Int)]], (T_A[Char, Char],Int)]

val v_a: T_A[T_A[(T_A[Char, Char],Int), T_A[(T_A[Char, Char],Int), (T_A[Char, Char],Int)]], (T_A[Char, Char],Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}