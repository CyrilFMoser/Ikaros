package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: C) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Char]], C]
case class CC_B[D](a: T_A[D, D], b: CC_A[(Int,(Boolean,Int))], c: T_A[D, D]) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Char]], D]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Boolean, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}