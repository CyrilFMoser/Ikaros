package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Char, Char], Boolean]]
case class CC_B(a: T_A[Int], b: (Boolean,T_B[CC_A, CC_A])) extends T_A[T_B[T_B[Char, Char], Boolean]]
case class CC_C[D, E](a: T_B[D, D], b: CC_A) extends T_B[D, E]
case class CC_D[G, F](a: CC_B, b: CC_C[F, F]) extends T_B[G, F]

val v_a: T_A[T_B[T_B[Char, Char], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,CC_C(_, _))) => 1 
  case CC_B(_, (_,CC_D(_, _))) => 2 
}
}