package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Byte, (Char,Char)], T_A[Char, Int]], b: T_A[T_A[Int, (Int,Byte)], T_A[Char, Boolean]], c: T_B[T_B[Boolean, Int], Byte]) extends T_A[(Byte,(Int,Boolean)), T_A[Int, T_B[Char, Byte]]]
case class CC_B[E, F](a: E, b: T_B[F, E], c: CC_A) extends T_B[F, E]
case class CC_C[G]() extends T_B[G, CC_A]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), CC_B(CC_A(_, _, _), CC_B(_, _, _), _), CC_A(CC_B(_, _, _), _, CC_B(_, _, _))) => 0 
  case CC_B(CC_A(_, _, _), CC_B(CC_A(_, _, _), CC_C(), _), CC_A(CC_B(_, _, _), _, CC_B(_, _, _))) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B(CC_A(_, _, _), CC_C(), CC_A(CC_B(_, _, _), _, CC_B(_, _, _)))