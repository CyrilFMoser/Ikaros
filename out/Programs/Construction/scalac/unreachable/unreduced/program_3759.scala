package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[Int], b: Boolean) extends T_A[T_A[Char, (Byte,Int)], Boolean]
case class CC_B(a: T_A[T_A[Int, CC_A], Char]) extends T_A[T_A[Char, (Byte,Int)], Boolean]
case class CC_C(a: CC_B, b: Boolean) extends T_A[T_A[Char, (Byte,Int)], Boolean]
case class CC_D[D](a: Byte, b: T_A[D, D]) extends T_B[D]

val v_a: T_A[T_A[Char, (Byte,Int)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_)