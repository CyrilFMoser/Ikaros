package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: C, c: Boolean) extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: T_A[T_B[Int]]) extends T_A[T_B[T_A[Boolean]]]
case class CC_C(a: T_B[CC_A[(Byte,Char)]], b: T_A[Char]) extends T_A[T_B[T_A[Boolean]]]
case class CC_D[D](a: D, b: CC_C, c: Byte) extends T_B[D]

val v_a: T_A[T_B[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}