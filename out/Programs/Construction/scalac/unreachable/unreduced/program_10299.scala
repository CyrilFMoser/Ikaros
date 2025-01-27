package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Char, Boolean], T_B[Char, Int]]]
case class CC_B(a: T_B[CC_A, T_A[CC_A]], b: (T_B[CC_A, CC_A],T_A[CC_A])) extends T_A[T_B[T_B[Char, Boolean], T_B[Char, Int]]]
case class CC_C(a: T_A[Byte], b: CC_B) extends T_A[T_B[T_B[Char, Boolean], T_B[Char, Int]]]
case class CC_D[E, D](a: CC_A, b: T_A[D]) extends T_B[D, E]
case class CC_E[F](a: T_B[F, F]) extends T_B[F, Char]

val v_a: T_A[T_B[T_B[Char, Boolean], T_B[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_B(CC_D(_, _), (_,_))) => 2 
}
}