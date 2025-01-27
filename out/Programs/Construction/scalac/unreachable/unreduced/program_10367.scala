package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D], c: (T_A[Byte],Byte)) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: CC_B[T_A[F]], b: T_B[F, F]) extends T_A[F]
case class CC_D[G](a: Char) extends T_B[T_A[CC_A[Boolean]], T_A[Char]]
case class CC_E() extends T_B[T_A[CC_A[Boolean]], T_A[Char]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_A(_, _, _),_)) => 0 
  case CC_A(_, _, (CC_B(),_)) => 1 
  case CC_A(_, _, (CC_C(_, _),_)) => 2 
  case CC_B() => 3 
  case CC_C(CC_B(), _) => 4 
}
}