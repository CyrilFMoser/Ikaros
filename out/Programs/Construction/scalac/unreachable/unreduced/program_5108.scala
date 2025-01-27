package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte], b: T_A[T_A[Char]]) extends T_A[T_B[Int]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_B[Int]]
case class CC_C(a: Char) extends T_A[T_B[Int]]
case class CC_D[C](a: T_B[C], b: Char, c: (CC_A,(CC_B,CC_C))) extends T_B[C]
case class CC_E[D](a: CC_D[D]) extends T_B[D]

val v_a: T_A[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}