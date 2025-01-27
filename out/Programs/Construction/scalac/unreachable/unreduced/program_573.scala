package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C(a: T_A[(Byte,Boolean)], b: CC_A[(Int,Boolean)], c: T_A[T_A[Int]]) extends T_A[(T_B[Int, Char],Byte)]
case class CC_D(a: CC_C, b: T_B[Byte, T_A[CC_C]], c: T_A[Int]) extends T_B[T_A[CC_A[CC_C]], T_B[T_A[(Char,Char)], Int]]
case class CC_E[F]() extends T_B[T_A[CC_A[CC_C]], T_B[T_A[(Char,Char)], Int]]

val v_a: T_B[T_A[CC_A[CC_C]], T_B[T_A[(Char,Char)], Int]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _, _), _, _) => 0 
  case CC_E() => 1 
}
}