package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[Int, Boolean],T_B[Int]), b: D) extends T_A[(T_A[Byte, (Int,Char)],T_A[Char, Char]), D]
case class CC_B[E](a: (Char,T_B[Char]), b: T_B[E], c: T_B[E]) extends T_A[(T_A[Byte, (Int,Char)],T_A[Char, Char]), E]
case class CC_C[F](a: CC_B[F], b: CC_A[F], c: (T_A[Byte, Char],T_A[Byte, Byte])) extends T_A[(T_A[Byte, (Int,Char)],T_A[Char, Char]), (Byte,CC_B[Int])]
case class CC_D(a: T_A[Boolean, CC_A[(Boolean,Byte)]], b: CC_C[T_A[(Byte,Int), Boolean]]) extends T_B[CC_B[Char]]

val v_a: T_A[(T_A[Byte, (Int,Char)],T_A[Char, Char]), (Byte,CC_B[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(('x',_), _, _) => 1 
  case CC_C(_, _, (_,_)) => 2 
}
}
// This is not matched: CC_B((_,_), _, _)