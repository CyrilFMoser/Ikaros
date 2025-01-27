package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, (Byte,T_A[Char, Byte])]
case class CC_B[D](a: D, b: (T_A[(Char,Boolean), Byte],CC_A[Char])) extends T_A[D, (Byte,T_A[Char, Byte])]
case class CC_C[E, F](a: (T_A[(Int,Int), Char],T_A[Char, Char]), b: Char, c: E) extends T_A[E, (Byte,T_A[Char, Byte])]

val v_a: T_A[Byte, (Byte,T_A[Char, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C((_,_), _, _) => 2 
}
}