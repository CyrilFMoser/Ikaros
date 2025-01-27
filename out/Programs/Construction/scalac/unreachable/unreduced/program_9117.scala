package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_B[(Byte,Byte), Int]]]
case class CC_B(a: T_A[Byte], b: T_A[T_A[CC_A]]) extends T_A[T_A[T_B[(Byte,Byte), Int]]]
case class CC_C[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_D[E](a: T_A[E]) extends T_B[Int, E]
case class CC_E[F](a: T_A[F], b: Byte) extends T_B[Int, F]

val v_a: T_A[T_A[T_B[(Byte,Byte), Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_, CC_C(_, _)), CC_C(_, CC_C(_, _))) => 1 
  case CC_C(_, CC_A()) => 2 
  case CC_C(_, CC_B(CC_C(_, _), CC_C(_, _))) => 3 
  case CC_C(_, CC_C(_, _)) => 4 
}
}