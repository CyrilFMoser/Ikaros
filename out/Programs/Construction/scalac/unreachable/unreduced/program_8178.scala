package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Byte]]) extends T_A[T_A[T_B[Char, Int]]]
case class CC_B(a: T_B[T_B[Byte, Byte], T_B[CC_A, CC_A]]) extends T_A[T_A[T_B[Char, Int]]]
case class CC_C[E, D](a: T_B[E, D], b: CC_A) extends T_B[E, D]
case class CC_D[G, F]() extends T_B[G, F]

val v_a: T_A[T_A[T_B[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}