package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[(Byte,Int), Boolean]], b: T_B[Byte, T_A[Char]], c: T_B[T_B[Int, Char], T_B[Boolean, Int]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[CC_A]) extends T_B[Char, T_A[T_A[Int]]]
case class CC_C[D](a: D, b: CC_A, c: CC_B) extends T_B[Char, T_A[T_A[Int]]]
case class CC_D(a: CC_C[T_A[CC_B]], b: CC_C[Char]) extends T_B[Char, T_A[T_A[Int]]]

val v_a: T_B[Char, T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_A(_, _, _), CC_B(_)) => 1 
  case CC_D(_, _) => 2 
}
}