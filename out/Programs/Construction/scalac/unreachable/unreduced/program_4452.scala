package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, (Int,(Char,Byte))]) extends T_A[D]
case class CC_B[E]() extends T_A[CC_A[T_A[Int]]]
case class CC_C[F](a: T_A[F]) extends T_B[F, CC_B[CC_A[Int]]]

val v_a: T_A[CC_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}