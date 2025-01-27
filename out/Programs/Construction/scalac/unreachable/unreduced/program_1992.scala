package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[(Int,Char), T_A[(Byte,Byte), Boolean]], b: T_B[Char, Int], c: T_A[T_B[Char, Int], T_A[Int, Char]]) extends T_A[T_B[T_B[Char, Boolean], T_A[Char, Char]], T_B[Boolean, T_A[Boolean, Int]]]
case class CC_B(a: Int, b: Byte, c: Char) extends T_A[T_B[T_B[Char, Boolean], T_A[Char, Char]], T_B[Boolean, T_A[Boolean, Int]]]
case class CC_C(a: CC_A) extends T_A[T_B[T_B[Char, Boolean], T_A[Char, Char]], T_B[Boolean, T_A[Boolean, Int]]]
case class CC_D[E, F](a: T_B[F, F], b: CC_B) extends T_B[E, F]
case class CC_E[H, G]() extends T_B[G, H]
case class CC_F[I](a: CC_B, b: Byte, c: CC_D[I, I]) extends T_B[I, Boolean]

val v_a: T_A[T_B[T_B[Char, Boolean], T_A[Char, Char]], T_B[Boolean, T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), CC_D(CC_D(_, _), CC_B(_, _, _)), _) => 0 
  case CC_A(CC_E(), CC_D(CC_D(_, _), CC_B(_, _, _)), _) => 1 
  case CC_A(CC_D(_, _), CC_D(CC_E(), CC_B(_, _, _)), _) => 2 
  case CC_A(CC_E(), CC_D(CC_E(), CC_B(_, _, _)), _) => 3 
  case CC_A(CC_D(_, _), CC_E(), _) => 4 
  case CC_A(CC_E(), CC_E(), _) => 5 
  case CC_B(_, _, _) => 6 
  case CC_C(CC_A(_, _, _)) => 7 
}
}