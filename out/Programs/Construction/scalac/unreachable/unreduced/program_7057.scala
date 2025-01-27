package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Byte, Boolean]], b: T_A[T_B[Byte, Boolean]]) extends T_A[(T_A[Int],T_B[Boolean, Int])]
case class CC_B[E, D](a: D, b: Char) extends T_B[D, E]
case class CC_C[F, G](a: F, b: T_B[G, G]) extends T_B[F, G]
case class CC_D[H, I]() extends T_B[I, H]

val v_a: T_B[T_A[(T_A[Int],T_B[Boolean, Int])], CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_C(CC_A(_, _), CC_B(CC_A(_, _), _)) => 1 
  case CC_C(CC_A(_, _), CC_C(CC_A(_, _), _)) => 2 
  case CC_C(CC_A(_, _), CC_D()) => 3 
  case CC_D() => 4 
}
}