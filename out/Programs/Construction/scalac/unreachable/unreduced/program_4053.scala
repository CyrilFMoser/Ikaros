package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, E]) extends T_A[E, F]
case class CC_B[G](a: T_B[G, G], b: T_A[G, G]) extends T_A[G, T_A[G, T_B[G, G]]]
case class CC_C[I, H](a: ((Char,Int),Byte), b: ((Byte,Boolean),T_A[Int, Int])) extends T_A[I, H]
case class CC_D[J](a: (T_A[Char, Char],Byte), b: (Int,(Int,Byte))) extends T_B[J, CC_A[CC_C[Boolean, Int], T_A[Char, Char]]]

val v_a: T_A[Boolean, T_A[Boolean, T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(((_,_),_), ((_,_),CC_A(_))) => 2 
  case CC_C(((_,_),_), ((_,_),CC_C(_, _))) => 3 
}
}