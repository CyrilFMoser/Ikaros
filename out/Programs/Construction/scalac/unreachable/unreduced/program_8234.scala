package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_B[T_A[(Byte,Byte), Int]]]
case class CC_B[E](a: T_B[E]) extends T_A[E, T_B[T_A[(Byte,Byte), Int]]]
case class CC_C[F](a: T_B[F]) extends T_B[F]
case class CC_D[G](a: T_A[G, G]) extends T_B[G]

val v_a: T_A[Char, T_B[T_A[(Byte,Byte), Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(CC_C(_))) => 0 
  case CC_B(CC_C(CC_D(_))) => 1 
  case CC_B(CC_D(_)) => 2 
}
}
// This is not matched: CC_A(_)