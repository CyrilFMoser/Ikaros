package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Char], (Int,Int)], b: T_A[Int]) extends T_A[Int]
case class CC_B[D](a: T_A[D]) extends T_A[D]
case class CC_C() extends T_A[Int]
case class CC_D(a: CC_A, b: (CC_A,T_A[CC_C]), c: T_A[T_A[CC_A]]) extends T_B[Char, T_A[Int]]
case class CC_E(a: (T_A[CC_C],CC_A), b: CC_C) extends T_B[Char, T_A[Int]]
case class CC_F(a: CC_B[T_A[Int]]) extends T_B[Char, T_A[Int]]

val v_a: T_B[Char, T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_D(_, (CC_A(_, _),CC_B(_)), CC_B(CC_B(_))) => 0 
  case CC_E((CC_B(_),CC_A(_, _)), _) => 1 
  case CC_F(CC_B(CC_B(_))) => 2 
}
}