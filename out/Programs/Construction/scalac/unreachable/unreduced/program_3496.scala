package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Char,Byte),T_A[Char, Int])) extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], C]
case class CC_B[D, E](a: (CC_A[Char],CC_A[Char]), b: Char, c: E) extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], D]
case class CC_C[F](a: (T_A[Int, Int],Char), b: T_A[F, F], c: (T_A[Char, Int],Char)) extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], F]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Char, Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_)) => 0 
  case CC_B((CC_A(_),CC_A(_)), 'x', _) => 1 
  case CC_B((CC_A(_),CC_A(_)), _, _) => 2 
  case CC_C(_, _, _) => 3 
}
}