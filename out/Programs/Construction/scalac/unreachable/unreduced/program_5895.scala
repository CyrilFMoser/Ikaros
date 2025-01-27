package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char, b: T_B[E, E], c: T_A[E, E]) extends T_A[E, Boolean]
case class CC_B[F](a: T_B[F, F], b: F, c: T_A[F, Boolean]) extends T_A[F, Boolean]
case class CC_C[G](a: CC_A[G], b: (T_B[Byte, Char],CC_A[Char]), c: T_B[CC_B[T_B[(Boolean,Int), Boolean]], Char]) extends T_B[G, Char]
case class CC_D[I](a: T_B[I, Char]) extends T_B[I, Char]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), (CC_C(_, _, _),CC_A(_, _, _)), CC_C(_, (_,_), CC_C(_, _, _))) => 0 
  case CC_C(CC_A(_, _, _), (CC_D(_),CC_A(_, _, _)), CC_C(_, (_,_), CC_C(_, _, _))) => 1 
  case CC_C(CC_A(_, _, _), (CC_C(_, _, _),CC_A(_, _, _)), CC_C(_, (_,_), CC_D(_))) => 2 
  case CC_C(CC_A(_, _, _), (CC_D(_),CC_A(_, _, _)), CC_C(_, (_,_), CC_D(_))) => 3 
  case CC_C(CC_A(_, _, _), (CC_C(_, _, _),CC_A(_, _, _)), CC_D(_)) => 4 
  case CC_C(CC_A(_, _, _), (CC_D(_),CC_A(_, _, _)), CC_D(_)) => 5 
  case CC_D(CC_C(_, _, _)) => 6 
  case CC_D(CC_D(CC_C(_, _, _))) => 7 
  case CC_D(CC_D(CC_D(_))) => 8 
}
}