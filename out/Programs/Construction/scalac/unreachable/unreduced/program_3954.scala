package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[D], D], b: ((Byte,Int),T_A[Byte, Int]), c: T_A[D, D]) extends T_A[T_B[D], D]
case class CC_B[E](a: T_B[E], b: CC_A[E], c: E) extends T_A[T_A[T_B[CC_A[E]], CC_A[E]], E]
case class CC_C[F](a: CC_B[F]) extends T_B[F]
case class CC_D[G](a: ((Char,Byte),CC_A[Boolean]), b: CC_A[G], c: T_B[G]) extends T_B[G]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_C(_), _, _)) => 0 
  case CC_C(CC_B(CC_D(_, _, _), _, _)) => 1 
  case CC_D(((_,_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _), CC_D((_,_), CC_A(_, _, _), CC_C(_))) => 2 
  case CC_D(((_,_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _), CC_D((_,_), CC_A(_, _, _), CC_D(_, _, _))) => 3 
}
}
// This is not matched: CC_D(((_,_),CC_A(_, _, _)), CC_A(CC_A(_, _, _), (_,_), _), CC_C(CC_B(_, _, _)))