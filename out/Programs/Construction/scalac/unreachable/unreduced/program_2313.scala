package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[T_A[Char, Byte], T_A[Byte, Int]], (T_B[Int, Int],T_A[(Boolean,Byte), Int])]
case class CC_B[E](a: (T_B[(Byte,Boolean), CC_A],Char), b: E) extends T_B[T_A[Char, Boolean], E]
case class CC_C[F, G](a: CC_B[F], b: T_B[T_B[G, F], G], c: T_B[F, G]) extends T_B[F, G]

val v_a: T_B[T_A[Char, Boolean], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B((_,_), _), CC_C(CC_B(_, _), _, CC_C(_, _, _)), CC_B((_,_), _)) => 2 
  case CC_C(CC_B((_,_), _), CC_C(CC_B(_, _), _, CC_C(_, _, _)), CC_C(CC_B(_, _), _, CC_C(_, _, _))) => 3 
}
}
// This is not matched: CC_C(CC_B((_,_), _), CC_C(CC_B(_, _), _, CC_C(_, _, _)), CC_C(CC_B(_, _), _, CC_B(_, _)))