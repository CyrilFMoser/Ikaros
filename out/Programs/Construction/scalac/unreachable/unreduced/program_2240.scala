package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, T_A[E, E]], b: Int, c: T_B[E, E]) extends T_A[T_B[T_A[(Char,Int), Int], T_B[Int, Boolean]], E]
case class CC_B[F](a: (T_A[Byte, Boolean],Int), b: F) extends T_A[T_B[T_A[(Char,Int), Int], T_B[Int, Boolean]], F]
case class CC_C(a: (CC_B[(Int,Char)],Char)) extends T_A[T_B[T_A[(Char,Int), Int], T_B[Int, Boolean]], T_A[(Int,Byte), CC_A[Boolean]]]
case class CC_D[G, H](a: CC_B[H], b: CC_C) extends T_B[G, H]
case class CC_E[I, J, K](a: K, b: Char, c: T_B[J, J]) extends T_B[J, I]
case class CC_F() extends T_B[Char, T_B[CC_B[CC_C], (CC_C,CC_C)]]

val v_a: T_A[T_B[T_A[(Char,Int), Int], T_B[Int, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_B(_, _), CC_C(_)), _, CC_D(CC_B(_, _), CC_C(_))) => 0 
  case CC_A(CC_D(CC_B(_, _), CC_C(_)), _, CC_E(_, _, _)) => 1 
  case CC_A(CC_E(_, _, _), _, CC_D(CC_B(_, _), CC_C(_))) => 2 
  case CC_A(CC_E(_, _, _), _, CC_E(_, _, _)) => 3 
  case CC_B((_,_), _) => 4 
}
}