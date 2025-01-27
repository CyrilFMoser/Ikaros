package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Boolean, Byte],T_A[Int])) extends T_A[D]
case class CC_B(a: T_A[T_A[Boolean]]) extends T_A[CC_A[Boolean]]
case class CC_C[E, F](a: T_A[CC_A[Boolean]]) extends T_B[T_A[(CC_B,Char)], E]

val v_a: T_A[CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_))) => 0 
  case CC_B(CC_A(_)) => 1 
}
}