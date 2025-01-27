package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[(Char,Boolean), D]
case class CC_B[F](a: T_B[F], b: CC_A[T_B[F], F], c: (Char,T_A[(Boolean,Boolean), Int])) extends T_A[(Char,Boolean), F]
case class CC_C[G](a: (T_A[Int, Byte],CC_A[Boolean, Int])) extends T_B[G]
case class CC_D[H](a: CC_B[H]) extends T_B[H]
case class CC_E[I](a: I, b: ((Int,Char),CC_C[Int]), c: CC_B[I]) extends T_B[I]

val v_a: T_A[(Char,Boolean), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C((_,_)), CC_A(), (_,_)) => 1 
  case CC_B(CC_D(_), CC_A(), (_,_)) => 2 
  case CC_B(CC_E(_, (_,_), _), CC_A(), (_,_)) => 3 
}
}