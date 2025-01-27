package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[E], b: E) extends T_A[D]
case class CC_B[F]() extends T_A[F]
case class CC_C(a: T_B[T_A[Char], (Int,Int)], b: CC_B[Boolean]) extends T_A[T_A[Char]]
case class CC_D(a: T_A[T_A[CC_C]], b: T_A[T_A[Char]], c: Byte) extends T_B[T_A[CC_C], (T_A[CC_C],Boolean)]
case class CC_E(a: T_A[CC_A[CC_D, CC_D]], b: T_A[(CC_C,CC_C)]) extends T_B[T_A[CC_C], (T_A[CC_C],Boolean)]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_B()) => 2 
}
}