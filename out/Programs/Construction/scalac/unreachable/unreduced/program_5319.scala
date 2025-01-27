package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[Byte, Boolean],(Boolean,Char))) extends T_A[E, (Char,T_B[Byte, Int])]
case class CC_B[F](a: CC_A[F], b: T_A[Byte, T_A[F, F]], c: Int) extends T_A[F, (Char,T_B[Byte, Int])]
case class CC_C[G]() extends T_A[G, (Char,T_B[Byte, Int])]

val v_a: T_A[Byte, (Char,T_B[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}