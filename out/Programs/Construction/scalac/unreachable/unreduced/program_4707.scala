package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Byte) extends T_A[Boolean, D]
case class CC_B[E](a: Char, b: Byte, c: (T_A[Char, Char],Char)) extends T_A[Boolean, E]
case class CC_C[F](a: T_B[F], b: T_A[Boolean, F], c: ((Char,(Boolean,Char)),Char)) extends T_A[Boolean, F]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, (_,'x')) => 1 
  case CC_B(_, _, (_,_)) => 2 
  case CC_C(_, _, _) => 3 
}
}