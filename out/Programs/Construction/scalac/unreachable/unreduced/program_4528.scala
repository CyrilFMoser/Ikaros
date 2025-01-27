package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_B[Byte, Int],T_B[Byte, Int]), b: Byte) extends T_A[(T_A[(Byte,Byte)],T_B[Char, Int])]
case class CC_B[D](a: CC_A, b: T_A[D], c: T_B[T_A[Byte], D]) extends T_B[T_A[Byte], D]
case class CC_C[E](a: Char) extends T_B[T_A[Byte], E]
case class CC_D[F](a: CC_A, b: F) extends T_B[T_A[Byte], F]

val v_a: T_B[T_A[Byte], Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A((_,_), _), _, CC_B(CC_A(_, _), _, CC_B(_, _, _))) => 0 
  case CC_B(CC_A((_,_), _), _, CC_B(CC_A(_, _), _, CC_C(_))) => 1 
  case CC_B(CC_A((_,_), _), _, CC_B(CC_A(_, _), _, CC_D(_, _))) => 2 
  case CC_B(CC_A((_,_), _), _, CC_C(_)) => 3 
  case CC_B(CC_A((_,_), _), _, CC_D(CC_A(_, _), _)) => 4 
  case CC_D(_, _) => 5 
}
}
// This is not matched: CC_C(_)