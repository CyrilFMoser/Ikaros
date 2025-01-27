package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[Byte], b: T_B[D, D], c: D) extends T_A[D]
case class CC_B[E](a: E, b: (CC_A[Boolean],T_B[Boolean, Boolean])) extends T_B[E, CC_A[T_B[Int, Char]]]
case class CC_C[F]() extends T_B[F, CC_A[T_B[Int, Char]]]

val v_a: T_B[Char, CC_A[T_B[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_A(_, _, _),_)) => 0 
  case CC_C() => 1 
}
}