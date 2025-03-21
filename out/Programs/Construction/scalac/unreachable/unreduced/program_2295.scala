package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: Boolean) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D](a: CC_A[D], b: Boolean, c: (((Boolean,Int),Int),Boolean)) extends T_A[T_A[D, T_A[D, D]], D]

val v_a: T_A[T_A[Char, T_A[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}