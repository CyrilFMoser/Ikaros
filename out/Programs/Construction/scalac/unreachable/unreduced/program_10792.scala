package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[T_A[Byte, Byte], Boolean], T_A[T_A[T_A[Byte, Byte], Boolean], T_A[T_A[Byte, Byte], Boolean]]], b: T_A[D, D], c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_B[F](a: (T_A[Int, Char],T_B[Byte]), b: T_B[T_A[F, F]], c: CC_A[F]) extends T_A[F, T_A[F, F]]
case class CC_C[G](a: G, b: CC_A[G]) extends T_A[G, T_A[G, G]]
case class CC_D[H](a: (CC_C[Byte],CC_A[Char])) extends T_B[H]
case class CC_E(a: T_B[T_B[Int]], b: T_A[Char, T_A[Char, Char]], c: T_B[CC_C[(Byte,Char)]]) extends T_B[Boolean]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_D((_,_)), CC_A(CC_B(_, _, _), _, _), CC_D((_,_))) => 0 
  case CC_E(CC_D((_,_)), CC_A(CC_C(_, _), _, _), CC_D((_,_))) => 1 
  case CC_E(CC_D((_,_)), CC_B(_, _, CC_A(_, _, _)), CC_D((_,_))) => 2 
  case CC_E(CC_D((_,_)), CC_C(_, _), CC_D((_,_))) => 3 
}
}
// This is not matched: CC_E(CC_D((_,_)), CC_A(CC_A(_, _, _), _, _), CC_D((_,_)))