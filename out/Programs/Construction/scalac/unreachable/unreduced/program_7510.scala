package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_B[T_B[D]], D]
case class CC_B[E](a: T_B[E]) extends T_B[E]
case class CC_C[F]() extends T_B[F]
case class CC_D(a: (CC_C[Int],CC_C[Char]), b: T_A[T_B[Boolean], Char], c: T_B[Char]) extends T_B[CC_C[T_B[Boolean]]]

val v_a: T_B[CC_C[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C())) => 1 
  case CC_B(CC_B(CC_D(_, _, _))) => 2 
  case CC_B(CC_C()) => 3 
  case CC_B(CC_D(_, _, _)) => 4 
  case CC_C() => 5 
  case CC_D(_, _, _) => 6 
}
}