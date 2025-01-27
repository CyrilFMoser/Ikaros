package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[D, T_A[(Int,Byte), Byte]], D]
case class CC_B[E](a: T_B[E], b: E) extends T_A[T_A[E, T_A[(Int,Byte), Byte]], E]
case class CC_C(a: CC_A[Char], b: CC_B[T_A[Byte, Int]]) extends T_B[T_B[T_A[Boolean, Char]]]
case class CC_D[F](a: T_B[F]) extends T_B[F]

val v_a: T_B[T_B[T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_B(_, _)) => 0 
  case CC_D(CC_C(_, CC_B(_, _))) => 1 
  case CC_D(CC_D(CC_C(_, _))) => 2 
  case CC_D(CC_D(CC_D(_))) => 3 
}
}