package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[T_A[(Byte,Int), Byte], Byte], b: T_A[D, E]) extends T_A[D, Byte]
case class CC_B[G](a: G, b: T_A[G, Byte], c: T_A[G, T_A[G, G]]) extends T_A[G, Byte]
case class CC_C[H](a: T_A[H, Byte], b: T_B[H]) extends T_B[H]
case class CC_D(a: Byte) extends T_B[T_A[T_A[Int, Byte], T_A[Char, Byte]]]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_B(_, CC_B(_, _, _), _) => 2 
}
}
// This is not matched: CC_B(_, CC_A(CC_A(_, _), _), _)