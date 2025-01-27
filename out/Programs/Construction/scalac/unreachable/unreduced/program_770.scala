package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[Byte, Boolean],Byte)) extends T_A[E, T_A[T_A[E, E], E]]
case class CC_B[F](a: T_B[F, F], b: F, c: (Char,T_A[Byte, Char])) extends T_A[T_A[CC_A[Char], T_B[Boolean, (Byte,Byte)]], F]
case class CC_C[H, G](a: T_A[G, H], b: CC_A[H]) extends T_B[H, G]
case class CC_D[I](a: (T_B[Int, (Byte,Int)],T_B[Int, Int])) extends T_B[Int, I]

val v_a: T_A[T_A[CC_A[Char], T_B[Boolean, (Byte,Byte)]], T_A[T_A[T_A[CC_A[Char], T_B[Boolean, (Byte,Byte)]], T_A[CC_A[Char], T_B[Boolean, (Byte,Byte)]]], T_A[CC_A[Char], T_B[Boolean, (Byte,Byte)]]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
}
}