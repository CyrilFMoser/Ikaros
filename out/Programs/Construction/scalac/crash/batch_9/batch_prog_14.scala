package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[T_A[C, C], C], b: Byte) extends T_A[C, D]
case class CC_B[E, F](a: T_A[(Byte,Int), E], b: T_A[F, F]) extends T_A[F, E]
case class CC_C(a: CC_A[T_A[(Int,Boolean), Int], T_A[Int, Byte]], b: T_A[Byte, Int]) extends T_A[T_A[CC_B[Int, Char], Byte], CC_A[CC_B[Boolean, Char], T_A[Byte, Int]]]

val v_a: T_A[T_A[CC_B[Int, Char], Byte], CC_A[CC_B[Boolean, Char], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _)), _) => 1 
  case CC_A(CC_B(CC_A(_, _), CC_B(_, _)), _) => 2 
  case CC_A(CC_B(CC_B(_, _), CC_B(_, _)), _) => 3 
  case CC_B(_, _) => 4 
  case CC_C(_, _) => 5 
}
}
// This is not matched: CC_A(CC_B(CC_B(_, _), CC_A(_, _)), _)