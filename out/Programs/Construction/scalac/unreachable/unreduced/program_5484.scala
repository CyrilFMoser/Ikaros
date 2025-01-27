package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[D], D]
case class CC_B(a: T_A[T_B[(Byte,Char)], (Byte,Char)], b: (T_A[(Char,Boolean), Char],T_A[Boolean, Char]), c: (T_B[Char],T_B[Char])) extends T_A[T_A[CC_A[(Int,Boolean)], T_A[Char, Char]], Byte]
case class CC_C(a: T_B[T_B[CC_B]], b: CC_A[T_A[CC_B, CC_B]], c: T_A[T_B[T_B[CC_B]], T_B[CC_B]]) extends T_A[T_A[CC_A[(Int,Boolean)], T_A[Char, Char]], Byte]
case class CC_D[E](a: E, b: E, c: CC_B) extends T_B[E]
case class CC_E[F](a: CC_C) extends T_B[F]
case class CC_F[G](a: T_B[CC_E[CC_C]]) extends T_B[G]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, (_,_), (_,_)), CC_B(_, _, _), _) => 0 
  case CC_E(_) => 1 
  case CC_F(_) => 2 
}
}