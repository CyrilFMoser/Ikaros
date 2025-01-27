package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, T_B[T_B[(Byte,Int)]]]
case class CC_B[F](a: (T_A[Char, Char],Char)) extends T_A[F, T_B[T_B[(Byte,Int)]]]

val v_a: T_A[Byte, T_B[T_B[(Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,'x')) => 1 
}
}
// This is not matched: CC_B((_,_))