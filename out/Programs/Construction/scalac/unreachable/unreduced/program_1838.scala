package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_A[E, E]], b: T_B[E, E], c: E) extends T_A[E, T_A[E, E]]
case class CC_B() extends T_A[T_A[T_B[Byte, Int], (Char,Int)], T_A[T_A[T_B[Byte, Int], (Char,Int)], T_A[T_B[Byte, Int], (Char,Int)]]]
case class CC_C[F](a: (T_A[Char, CC_B],CC_B), b: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]
case class CC_D[G](a: Char) extends T_B[G, CC_B]

val v_a: T_A[T_A[T_B[Byte, Int], (Char,Int)], T_A[T_A[T_B[Byte, Int], (Char,Int)], T_A[T_B[Byte, Int], (Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,_), CC_A(_, _, _)) => 1 
  case CC_C((_,_), CC_B()) => 2 
  case CC_C((_,_), CC_C(_, _)) => 3 
}
}
// This is not matched: CC_A(_, _, _)