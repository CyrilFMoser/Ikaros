package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: ((Char,Int),Int), b: T_B[D]) extends T_A[(Int,T_A[(Char,Int), Byte]), D]
case class CC_B(a: T_B[Byte]) extends T_A[(Int,T_A[(Char,Int), Byte]), Char]
case class CC_C[E, F](a: CC_A[F]) extends T_B[E]
case class CC_D[G](a: T_A[G, G], b: CC_A[G]) extends T_B[G]

val v_a: T_A[(Int,T_A[(Char,Int), Byte]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),12), CC_C(_)) => 0 
  case CC_A(((_,_),_), CC_C(_)) => 1 
  case CC_A(((_,_),12), CC_D(_, _)) => 2 
  case CC_A(((_,_),_), CC_D(_, _)) => 3 
}
}