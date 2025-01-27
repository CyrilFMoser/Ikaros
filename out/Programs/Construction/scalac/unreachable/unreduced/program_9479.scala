package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Byte, b: T_A[F, E]) extends T_A[E, F]
case class CC_B[G, H](a: T_B[H, H], b: T_A[H, H]) extends T_A[G, H]
case class CC_C(a: T_B[(Int,Int), T_B[Char, Int]]) extends T_B[CC_A[T_B[Char, Int], T_B[Int, Boolean]], T_A[T_A[Byte, Byte], T_A[Byte, Boolean]]]
case class CC_D(a: (T_B[CC_C, CC_C],CC_C), b: T_A[T_A[CC_C, CC_C], T_A[CC_C, CC_C]], c: (T_A[Char, (Int,Boolean)],T_A[CC_C, Byte])) extends T_B[CC_A[T_B[Char, Int], T_B[Int, Boolean]], T_A[T_A[Byte, Byte], T_A[Byte, Boolean]]]
case class CC_E(a: Int, b: T_A[Char, Char]) extends T_B[CC_A[T_B[Char, Int], T_B[Int, Boolean]], T_A[T_A[Byte, Byte], T_A[Byte, Boolean]]]

val v_a: T_B[CC_A[T_B[Char, Int], T_B[Int, Boolean]], T_A[T_A[Byte, Byte], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E(_, CC_A(_, CC_A(_, _))) => 2 
  case CC_E(_, CC_A(_, CC_B(_, _))) => 3 
  case CC_E(_, CC_B(_, CC_A(_, _))) => 4 
}
}
// This is not matched: CC_E(_, CC_B(_, CC_B(_, _)))