package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E]) extends T_A[(T_A[Boolean, Byte],((Char,Boolean),Boolean)), E]
case class CC_B[F, G]() extends T_A[(T_A[Boolean, Byte],((Char,Boolean),Boolean)), F]
case class CC_C[H](a: T_B[H, H], b: (T_A[Char, Int],CC_A[Int]), c: T_A[H, H]) extends T_B[H, (T_B[Int, Char],T_B[Boolean, Int])]
case class CC_D[I]() extends T_B[I, T_A[I, I]]
case class CC_E(a: Char, b: T_A[T_A[Byte, (Char,Char)], CC_D[Boolean]], c: (Int,(Byte,Int))) extends T_B[CC_B[T_A[Char, Char], Boolean], (T_B[Int, Char],T_B[Boolean, Int])]

val v_a: T_A[(T_A[Boolean, Byte],((Char,Boolean),Boolean)), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}