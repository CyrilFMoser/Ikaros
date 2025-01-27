package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, Char], b: T_B[T_B[(Byte,Char), T_A], T_B[(Int,Int), T_A]]) extends T_A
case class CC_B[C]() extends T_A
case class CC_C[D](a: Boolean, b: D, c: T_B[D, D]) extends T_B[D, CC_A]
case class CC_D[E](a: E, b: T_B[E, CC_A]) extends T_B[E, CC_A]
case class CC_E[F](a: CC_C[F], b: Byte, c: (CC_B[CC_A],T_B[Int, CC_A])) extends T_B[F, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}