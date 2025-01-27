package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[(Char,Boolean)]], b: Byte) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[Int]], b: T_B[T_A[(Int,Char)]], c: (CC_A,CC_A)) extends T_A[T_A[Int]]
case class CC_C(a: Byte, b: T_B[((Int,Char),Char)]) extends T_A[T_A[Int]]
case class CC_D[C](a: CC_A, b: C) extends T_B[C]
case class CC_E(a: Boolean, b: T_B[CC_B], c: CC_A) extends T_B[T_A[T_B[CC_B]]]
case class CC_F(a: Int, b: T_B[CC_A]) extends T_B[T_A[T_B[CC_B]]]

val v_a: T_B[T_A[T_B[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_D(_, _), _), _) => 0 
  case CC_E(_, _, CC_A(CC_D(_, _), _)) => 1 
  case CC_F(_, _) => 2 
}
}