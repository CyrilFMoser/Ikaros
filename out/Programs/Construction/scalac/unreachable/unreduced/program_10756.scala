package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: (T_B[Byte, Char],T_A[Int, Boolean]), b: T_A[F, F]) extends T_A[E, F]
case class CC_B[H, G](a: T_A[T_A[H, Boolean], G]) extends T_A[H, G]
case class CC_C[I]() extends T_B[Int, I]
case class CC_D(a: T_A[(Char,Byte), Char]) extends T_B[Int, T_A[T_A[Byte, Char], T_B[Int, Int]]]
case class CC_E[J](a: Byte) extends T_B[T_A[CC_B[(Boolean,Char), CC_D], Boolean], J]

val v_a: T_B[Int, T_A[T_A[Byte, Char], T_B[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A((_,_), CC_B(_))) => 1 
  case CC_D(CC_B(CC_A(_, _))) => 2 
  case CC_D(CC_B(CC_B(_))) => 3 
}
}
// This is not matched: CC_D(CC_A((_,_), CC_A(_, _)))