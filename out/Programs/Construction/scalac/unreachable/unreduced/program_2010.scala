package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Char, Int], Int], b: T_B[T_B[Byte, Boolean], T_A[Byte, Int]], c: T_B[T_A[Char, Byte], T_B[Int, Boolean]]) extends T_A[T_A[T_B[Byte, (Int,Int)], T_A[Int, Char]], T_A[(Boolean,Boolean), (Char,Byte)]]
case class CC_B() extends T_A[T_A[T_B[Byte, (Int,Int)], T_A[Int, Char]], T_A[(Boolean,Boolean), (Char,Byte)]]
case class CC_C[E](a: CC_A) extends T_A[T_A[T_B[Byte, (Int,Int)], T_A[Int, Char]], T_A[(Boolean,Boolean), (Char,Byte)]]
case class CC_D[F, G](a: T_A[F, G], b: CC_B) extends T_B[G, F]
case class CC_E[I, H](a: T_B[H, I]) extends T_B[H, I]

val v_a: T_A[T_A[T_B[Byte, (Int,Int)], T_A[Int, Char]], T_A[(Boolean,Boolean), (Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, CC_B()), CC_D(_, _), CC_D(_, CC_B())) => 0 
  case CC_A(CC_D(_, CC_B()), CC_E(CC_D(_, _)), CC_D(_, CC_B())) => 1 
  case CC_A(CC_D(_, CC_B()), CC_E(CC_E(_)), CC_D(_, CC_B())) => 2 
  case CC_A(CC_E(CC_D(_, _)), CC_D(_, _), CC_D(_, CC_B())) => 3 
  case CC_A(CC_E(CC_D(_, _)), CC_E(CC_D(_, _)), CC_D(_, CC_B())) => 4 
  case CC_A(CC_E(CC_D(_, _)), CC_E(CC_E(_)), CC_D(_, CC_B())) => 5 
  case CC_A(CC_E(CC_E(_)), CC_D(_, _), CC_D(_, CC_B())) => 6 
  case CC_A(CC_E(CC_E(_)), CC_E(CC_D(_, _)), CC_D(_, CC_B())) => 7 
  case CC_A(CC_E(CC_E(_)), CC_E(CC_E(_)), CC_D(_, CC_B())) => 8 
  case CC_A(CC_D(_, CC_B()), CC_D(_, _), CC_E(CC_D(_, _))) => 9 
  case CC_A(CC_D(_, CC_B()), CC_E(CC_D(_, _)), CC_E(CC_D(_, _))) => 10 
  case CC_A(CC_D(_, CC_B()), CC_E(CC_E(_)), CC_E(CC_D(_, _))) => 11 
  case CC_A(CC_E(CC_D(_, _)), CC_D(_, _), CC_E(CC_D(_, _))) => 12 
  case CC_A(CC_E(CC_D(_, _)), CC_E(CC_D(_, _)), CC_E(CC_D(_, _))) => 13 
  case CC_A(CC_E(CC_D(_, _)), CC_E(CC_E(_)), CC_E(CC_D(_, _))) => 14 
  case CC_A(CC_E(CC_E(_)), CC_D(_, _), CC_E(CC_D(_, _))) => 15 
  case CC_A(CC_E(CC_E(_)), CC_E(CC_D(_, _)), CC_E(CC_D(_, _))) => 16 
  case CC_A(CC_E(CC_E(_)), CC_E(CC_E(_)), CC_E(CC_D(_, _))) => 17 
  case CC_A(CC_D(_, CC_B()), CC_D(_, _), CC_E(CC_E(_))) => 18 
  case CC_A(CC_D(_, CC_B()), CC_E(CC_D(_, _)), CC_E(CC_E(_))) => 19 
  case CC_A(CC_D(_, CC_B()), CC_E(CC_E(_)), CC_E(CC_E(_))) => 20 
  case CC_A(CC_E(CC_D(_, _)), CC_D(_, _), CC_E(CC_E(_))) => 21 
  case CC_A(CC_E(CC_D(_, _)), CC_E(CC_D(_, _)), CC_E(CC_E(_))) => 22 
  case CC_A(CC_E(CC_D(_, _)), CC_E(CC_E(_)), CC_E(CC_E(_))) => 23 
  case CC_A(CC_E(CC_E(_)), CC_D(_, _), CC_E(CC_E(_))) => 24 
  case CC_A(CC_E(CC_E(_)), CC_E(CC_D(_, _)), CC_E(CC_E(_))) => 25 
  case CC_A(CC_E(CC_E(_)), CC_E(CC_E(_)), CC_E(CC_E(_))) => 26 
  case CC_B() => 27 
  case CC_C(_) => 28 
}
}