package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D, c: T_B[D]) extends T_A[D, T_A[(Boolean,Char), Int]]
case class CC_B[E](a: (T_B[Char],CC_A[Boolean]), b: T_A[E, E], c: T_B[E]) extends T_B[E]
case class CC_C[F](a: T_B[F], b: F) extends T_B[F]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B((_,_), _, _), _) => 0 
  case CC_C(CC_C(CC_B(_, _, _), 0), _) => 1 
  case CC_C(CC_C(CC_C(_, _), 0), _) => 2 
  case CC_C(CC_C(CC_B(_, _, _), _), _) => 3 
}
}
// This is not matched: CC_C(CC_C(CC_C(_, _), _), _)