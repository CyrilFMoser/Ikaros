package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D) extends T_A[T_B[T_B[Boolean]], D]
case class CC_B[E](a: T_A[E, Char]) extends T_A[T_B[T_B[Boolean]], E]
case class CC_C(a: CC_A[CC_B[Boolean]], b: Int) extends T_A[CC_A[T_A[Boolean, Int]], (CC_B[Char],(Char,Int))]
case class CC_D[F](a: T_B[F]) extends T_B[F]

val v_a: T_A[T_B[T_B[Boolean]], T_A[CC_A[T_A[Boolean, Int]], (CC_B[Char],(Char,Int))]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_A(_, _), _), _) => 0 
  case CC_B(_) => 1 
}
}