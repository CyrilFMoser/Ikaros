package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_A[Int, (Int,Byte)],T_B[Char, Char]), b: T_A[E, Char]) extends T_A[E, Char]
case class CC_B[F](a: (T_A[Byte, Char],Int), b: T_A[F, Char]) extends T_A[F, Char]
case class CC_C[G, H](a: G, b: T_A[H, Char]) extends T_B[G, H]
case class CC_D[J, I]() extends T_B[J, I]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_C(_, _)), _) => 0 
  case CC_A((_,CC_D()), _) => 1 
  case CC_B((CC_A(_, _),_), CC_A(_, _)) => 2 
  case CC_B((CC_B(_, _),_), CC_A(_, _)) => 3 
  case CC_B((CC_A(_, _),_), CC_B((_,_), _)) => 4 
  case CC_B((CC_B(_, _),_), CC_B((_,_), _)) => 5 
}
}