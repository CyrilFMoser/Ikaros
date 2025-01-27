package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[Byte, D], c: T_A[D]) extends T_A[D]
case class CC_B() extends T_A[T_A[CC_A[Char]]]
case class CC_C[E](a: (CC_B,CC_B)) extends T_B[(CC_A[CC_B],Boolean), E]
case class CC_D[F](a: ((CC_B,(Int,Boolean)),CC_A[CC_B]), b: T_A[F], c: T_A[F]) extends T_B[(CC_A[CC_B],Boolean), F]

val v_a: T_A[T_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(_, _, CC_B())