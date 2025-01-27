package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: (T_A[Char, Int],T_B[Char, (Char,Byte)]), c: (T_A[Boolean, Char],T_A[Byte, Byte])) extends T_A[E, T_A[E, E]]
case class CC_B[F]() extends T_A[F, T_A[F, F]]
case class CC_C[G](a: T_A[G, T_A[G, G]], b: T_A[G, G]) extends T_A[G, T_A[G, G]]
case class CC_D[I, H](a: (T_A[Byte, Byte],CC_A[Char]), b: CC_A[H]) extends T_B[I, H]
case class CC_E[J](a: T_A[J, T_A[J, J]]) extends T_B[J, T_A[J, J]]
case class CC_F(a: T_B[CC_C[Boolean], CC_B[(Byte,Byte)]], b: T_B[CC_C[(Byte,Byte)], CC_B[Boolean]]) extends T_B[T_B[CC_E[Int], CC_D[Char, Int]], T_A[T_B[CC_E[Int], CC_D[Char, Int]], T_B[CC_E[Int], CC_D[Char, Int]]]]

val v_a: T_B[T_B[T_B[CC_E[Int], CC_D[Char, Int]], T_A[T_B[CC_E[Int], CC_D[Char, Int]], T_B[CC_E[Int], CC_D[Char, Int]]]], T_A[T_B[T_B[CC_E[Int], CC_D[Char, Int]], T_A[T_B[CC_E[Int], CC_D[Char, Int]], T_B[CC_E[Int], CC_D[Char, Int]]]], T_B[T_B[CC_E[Int], CC_D[Char, Int]], T_A[T_B[CC_E[Int], CC_D[Char, Int]], T_B[CC_E[Int], CC_D[Char, Int]]]]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, (_,_), (_,_))) => 0 
  case CC_E(CC_A(_, (_,_), _)) => 1 
  case CC_E(CC_B()) => 2 
  case CC_E(CC_C(CC_A(_, _, _), _)) => 3 
  case CC_E(CC_C(CC_B(), _)) => 4 
  case CC_E(CC_C(CC_C(_, _), _)) => 5 
}
}