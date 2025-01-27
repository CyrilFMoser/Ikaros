package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[T_B[(Byte,Int)], D]
case class CC_B[E](a: (T_B[Boolean],CC_A[Char]), b: (T_A[Boolean, Char],T_B[Boolean]), c: T_B[E]) extends T_B[E]
case class CC_C[F](a: CC_A[F]) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_, _, _),CC_A(_)), _, CC_B((_,_), (_,_), CC_B(_, _, _))) => 0 
  case CC_B((CC_B(_, _, _),CC_A(_)), _, CC_B((_,_), (_,_), CC_C(_))) => 1 
  case CC_B((CC_B(_, _, _),CC_A(_)), _, CC_C(CC_A(_))) => 2 
  case CC_B((CC_C(_),CC_A(_)), _, CC_B((_,_), (_,_), CC_B(_, _, _))) => 3 
  case CC_B((CC_C(_),CC_A(_)), _, CC_B((_,_), (_,_), CC_C(_))) => 4 
  case CC_B((CC_C(_),CC_A(_)), _, CC_C(CC_A(_))) => 5 
}
}
// This is not matched: CC_C(CC_A(_))