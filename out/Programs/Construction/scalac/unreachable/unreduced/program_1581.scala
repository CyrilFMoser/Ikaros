package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, (Byte,Int)], b: T_B[D, T_B[D, D]]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: E, c: T_A[E]) extends T_B[E, (T_A[Int],T_A[Char])]
case class CC_C[F]() extends T_B[F, (T_A[Int],T_A[Char])]
case class CC_D[G](a: CC_A[G], b: G) extends T_B[CC_A[Char], (T_A[Int],T_A[Char])]

val v_a: T_B[CC_A[Char], (T_A[Int],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), _) => 0 
  case CC_C() => 1 
  case CC_D(_, _) => 2 
}
}