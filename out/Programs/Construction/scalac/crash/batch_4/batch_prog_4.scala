package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: F, b: Char) extends T_A[F]
case class CC_D[G]() extends T_B[G, CC_C[T_A[Byte]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}