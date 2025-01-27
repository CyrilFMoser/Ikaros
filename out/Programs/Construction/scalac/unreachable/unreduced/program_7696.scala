package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: T_A[T_B[CC_A, Int]]) extends T_A[T_A[T_A[Char]]]
case class CC_C[D, E](a: T_A[E], b: (T_B[CC_B, CC_B],CC_B), c: E) extends T_B[E, D]
case class CC_D[F, G](a: (T_B[CC_A, CC_A],(Int,Byte)), b: T_B[G, G], c: T_B[G, F]) extends T_B[Boolean, F]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}