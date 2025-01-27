package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_A[Byte, Char],T_A[Int, Int]), b: T_A[E, Char]) extends T_A[E, Char]
case class CC_B(a: T_B[T_B[Int, Byte], (Byte,Byte)], b: T_A[T_A[Char, Byte], Char]) extends T_A[T_A[T_B[Boolean, (Int,Byte)], CC_A[Char]], Char]
case class CC_C[F]() extends T_A[F, Char]
case class CC_D[G, H](a: CC_A[G], b: H, c: T_B[G, H]) extends T_B[H, G]
case class CC_E[I](a: CC_D[I, I], b: T_A[I, Char]) extends T_B[I, (CC_C[Byte],CC_A[Int])]
case class CC_F[J](a: CC_B) extends T_B[J, (CC_C[Byte],CC_A[Int])]

val v_a: CC_E[Boolean] = null
val v_b: Int = v_a match{
  case CC_E(CC_D(_, true, CC_D(_, _, _)), CC_A((_,_), CC_A(_, _))) => 0 
  case CC_E(CC_D(_, false, CC_D(_, _, _)), CC_A((_,_), CC_A(_, _))) => 1 
  case CC_E(CC_D(_, true, CC_D(_, _, _)), CC_A((_,_), CC_C())) => 2 
  case CC_E(CC_D(_, false, CC_D(_, _, _)), CC_A((_,_), CC_C())) => 3 
  case CC_E(CC_D(_, true, CC_D(_, _, _)), CC_C()) => 4 
  case CC_E(CC_D(_, false, CC_D(_, _, _)), CC_C()) => 5 
}
}