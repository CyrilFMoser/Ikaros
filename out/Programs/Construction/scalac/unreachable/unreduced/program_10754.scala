package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[E, E], b: T_B[D]) extends T_A[E, D]
case class CC_B[F]() extends T_A[F, Byte]
case class CC_C(a: T_A[CC_B[Boolean], Byte]) extends T_B[(Int,T_A[Boolean, Char])]

val v_a: T_A[CC_C, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B() => 1 
}
}