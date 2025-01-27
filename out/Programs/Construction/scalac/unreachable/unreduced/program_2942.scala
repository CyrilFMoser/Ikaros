package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: (CC_A[Int],T_B[(Int,Boolean), Byte])) extends T_A[E]
case class CC_C[F]() extends T_B[T_A[T_A[Char]], F]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_)) => 1 
  case CC_B((CC_A(_, _),_)) => 2 
}
}