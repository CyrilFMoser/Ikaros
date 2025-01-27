package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, Int]
case class CC_B[D](a: (T_A[Char, Int],Int), b: (T_A[Char, Int],T_A[Int, Int]), c: Int) extends T_A[D, Int]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _)