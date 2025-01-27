package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[(Char,Int), Int], c: Char) extends T_A
case class CC_B[C]() extends T_B[C, T_A]
case class CC_C[D, E](a: CC_B[E]) extends T_B[D, (T_B[T_A, Byte],Byte)]
case class CC_D[F](a: T_B[Boolean, F], b: F) extends T_B[F, T_A]

val v_a: T_B[Int, T_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(_, _) => 1 
}
}