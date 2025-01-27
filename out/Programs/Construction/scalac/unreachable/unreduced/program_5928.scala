package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: (Byte,T_B[Byte, (Char,Int)])) extends T_A[E, T_A[E, E]]
case class CC_B[F, G](a: T_A[G, T_A[F, F]], b: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]
case class CC_C[H](a: (CC_A[Int],((Byte,Char),Char))) extends T_A[H, T_A[H, H]]
case class CC_D[I](a: (T_B[Char, (Byte,Char)],(Boolean,Byte)), b: CC_B[I, I], c: T_A[I, T_A[I, I]]) extends T_B[I, (CC_A[Boolean],T_B[Byte, Int])]
case class CC_E[J](a: J, b: T_A[J, T_A[J, J]]) extends T_B[T_A[Int, CC_C[Char]], J]
case class CC_F[K]() extends T_B[T_A[Int, CC_C[Char]], K]

val v_a: T_B[T_A[Int, CC_C[Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_A(_, (_,_))) => 0 
  case CC_E(_, CC_B(_, _)) => 1 
  case CC_E(_, CC_C((_,_))) => 2 
  case CC_F() => 3 
}
}