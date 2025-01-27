package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[CC_A[E], E], b: T_B[E, T_A[E]], c: (CC_A[Boolean],CC_A[Byte])) extends T_B[E, T_A[E]]
case class CC_C[F]() extends T_B[F, T_A[F]]

val v_a: T_B[Char, T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _, _), _) => 0 
  case CC_B(_, CC_C(), _) => 1 
  case CC_C() => 2 
}
}