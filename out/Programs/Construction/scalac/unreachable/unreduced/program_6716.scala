package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, T_B[Char, Int]], b: Byte, c: T_A[T_A[Byte]]) extends T_A[T_B[Int, T_A[Int]]]
case class CC_B(a: T_B[T_B[Boolean, Char], ((Boolean,Boolean),CC_A)], b: T_B[Char, T_B[Char, CC_A]]) extends T_A[T_B[Int, T_A[Int]]]
case class CC_C(a: CC_B) extends T_A[T_B[Int, T_A[Int]]]

val v_a: T_A[T_B[Int, T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_B(_, _)) => 1 
}
}
// This is not matched: CC_B(_, _)