package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: (T_A[Boolean, Char],T_A[Char, Char])) extends T_A[(Char,T_A[(Int,Boolean), Char]), C]
case class CC_B[D, E]() extends T_A[(Char,T_A[(Int,Boolean), Char]), D]
case class CC_C[F](a: Char, b: CC_B[F, F], c: F) extends T_A[(Char,T_A[(Int,Boolean), Char]), (Boolean,CC_B[Byte, Int])]

val v_a: T_A[(Char,T_A[(Int,Boolean), Char]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}