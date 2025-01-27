package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[Char, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_A[F], b: F, c: (Byte,T_A[Char])) extends T_A[F]
case class CC_D[G](a: T_A[G]) extends T_B[T_A[T_A[Boolean]], G]
case class CC_E[H](a: CC_B[T_A[H]], b: CC_C[H], c: ((Byte,Boolean),T_B[Byte, Boolean])) extends T_B[T_A[T_A[Boolean]], H]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_), _, (_,_)) => 2 
  case CC_C(CC_B(), _, (_,_)) => 3 
  case CC_C(CC_C(_, _, _), _, (_,_)) => 4 
}
}