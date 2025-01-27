package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[E, E]) extends T_A[E, D]
case class CC_B[G, F](a: T_B[F], b: CC_A[F, G]) extends T_A[G, F]
case class CC_C() extends T_B[T_A[(Int,Char), T_A[Boolean, Byte]]]
case class CC_D(a: CC_B[Char, (CC_C,CC_C)], b: CC_C) extends T_B[T_A[(Int,Char), T_A[Boolean, Byte]]]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, CC_A(_))) => 1 
  case CC_B(_, _) => 2 
}
}