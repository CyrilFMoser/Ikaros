package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_B[T_B[(Byte,Byte), Int], T_B[Char, Int]], c: Boolean) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_B[CC_A, T_A[CC_A]], b: T_B[T_B[Boolean, CC_A], T_B[CC_A, CC_A]]) extends T_A[T_A[T_A[Int]]]
case class CC_C[D](a: D, b: CC_B) extends T_B[D, T_B[D, D]]
case class CC_D[E](a: E, b: CC_A) extends T_B[E, T_B[E, E]]

val v_a: T_B[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _)) => 0 
  case CC_D(0, _) => 1 
}
}
// This is not matched: CC_D(_, _)