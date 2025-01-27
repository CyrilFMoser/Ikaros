package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: T_A[D, T_A[D, D]], c: T_A[T_B[D], D]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: Char, b: Char, c: (T_B[Boolean],(Byte,(Byte,Boolean)))) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: F, b: F) extends T_A[F, T_A[F, F]]
case class CC_D[G](a: CC_C[G], b: CC_B[G], c: T_B[G]) extends T_B[G]
case class CC_E[H](a: Int, b: T_B[H]) extends T_B[H]
case class CC_F[I, J](a: CC_C[J], b: I, c: (Byte,Char)) extends T_B[I]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B('x', _, (CC_D(_, _, _),(_,_))) => 1 
  case CC_B('x', _, (CC_E(_, _),(_,_))) => 2 
  case CC_B('x', _, (CC_F(_, _, _),(_,_))) => 3 
  case CC_B(_, _, (CC_D(_, _, _),(_,_))) => 4 
  case CC_B(_, _, (CC_E(_, _),(_,_))) => 5 
  case CC_C(_, _) => 6 
}
}
// This is not matched: CC_B(_, _, (CC_F(_, _, _),(_,_)))