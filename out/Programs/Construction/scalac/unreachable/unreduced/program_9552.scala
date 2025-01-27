package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_A[T_A[(Char,Int), Int], ((Char,Char),Byte)]]
case class CC_B[E, F](a: E, b: (T_A[Char, Byte],T_B[Boolean])) extends T_B[E]
case class CC_C[G](a: (T_B[Char],T_A[Int, Char])) extends T_B[G]

val v_a: T_A[Boolean, T_A[T_A[(Char,Int), Int], ((Char,Char),Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _)) => 0 
  case CC_A(CC_C((_,_))) => 1 
}
}