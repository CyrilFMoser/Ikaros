package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Byte, b: T_B[D], c: E) extends T_A[D, E]
case class CC_B[F, G](a: T_A[F, F], b: Byte) extends T_A[F, G]
case class CC_C(a: Boolean, b: T_A[CC_A[Char, Int], CC_B[Int, Boolean]]) extends T_A[T_A[T_B[Int], T_B[Byte]], T_A[CC_B[(Int,Int), Char], T_A[Byte, Byte]]]
case class CC_D(a: T_B[(Byte,CC_C)], b: T_A[T_A[CC_C, CC_C], CC_B[CC_C, CC_C]]) extends T_B[T_A[CC_B[(Int,Char), CC_C], T_A[CC_C, (Char,Byte)]]]

val v_a: T_A[CC_D, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(_, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_D(_, CC_B(_, _))) => 1 
  case CC_B(CC_A(0, _, _), _) => 2 
  case CC_B(CC_B(_, _), _) => 3 
}
}
// This is not matched: CC_B(CC_A(_, _, _), _)