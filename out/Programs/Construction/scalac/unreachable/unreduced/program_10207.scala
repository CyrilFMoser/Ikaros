package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]], b: (T_A[Boolean],T_A[Char]), c: T_A[T_A[Int]]) extends T_A[T_A[(Int,Int)]]
case class CC_B() extends T_A[T_A[(Int,Int)]]
case class CC_C[C](a: T_B[C], b: CC_B, c: C) extends T_B[C]
case class CC_D(a: CC_B, b: CC_A, c: Char) extends T_B[CC_C[T_A[Byte]]]

val v_a: T_B[T_A[T_A[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), CC_A(_, _, _)), CC_B(), _) => 0 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(), CC_B()), CC_B(), _) => 1 
}
}