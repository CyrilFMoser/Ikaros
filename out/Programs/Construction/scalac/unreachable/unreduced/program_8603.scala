package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[CC_A[Int]], b: CC_A[T_A[Boolean]], c: T_A[Byte]) extends T_A[T_B[T_A[Byte]]]
case class CC_C(a: T_A[T_A[CC_B]]) extends T_B[CC_B]
case class CC_D(a: (T_A[Int],CC_B), b: CC_B, c: Int) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_))) => 0 
  case CC_D((CC_A(_),CC_B(_, _, _)), _, _) => 1 
}
}