package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, Boolean], T_A[Char, (Byte,Char)]], C]
case class CC_B[D](a: D, b: CC_A[D], c: T_A[D, D]) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, (Byte,Char)]], D]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Char, (Byte,Char)]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}