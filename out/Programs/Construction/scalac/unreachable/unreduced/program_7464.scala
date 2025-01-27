package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_B[T_A[F, F], F], b: (T_B[Byte, Int],CC_A[Boolean]), c: T_A[F, F]) extends T_B[T_A[F, F], F]
case class CC_C[G]() extends T_B[T_A[G, G], G]
case class CC_D[I, H](a: H, b: T_B[T_A[H, H], H], c: CC_C[H]) extends T_B[I, H]

val v_a: T_B[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), (_,_), _), (CC_D(_, _, _),CC_A(_)), _) => 0 
  case CC_B(CC_B(CC_D(_, _, _), (_,_), _), (CC_D(_, _, _),CC_A(_)), _) => 1 
  case CC_B(CC_C(), (CC_D(_, _, _),CC_A(_)), _) => 2 
  case CC_B(CC_D(_, _, _), (CC_D(_, _, _),CC_A(_)), _) => 3 
  case CC_C() => 4 
  case CC_D(_, _, _) => 5 
}
}
// This is not matched: CC_B(CC_B(CC_C(), (_,_), _), (CC_D(_, _, _),CC_A(_)), _)