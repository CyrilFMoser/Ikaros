package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: T_B) extends T_A[(T_B,T_B), C]
case class CC_B[D](a: T_A[D, D], b: Int) extends T_B
case class CC_C[E](a: (T_A[T_B, T_B],CC_B[T_B]), b: E, c: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C((_,CC_B(_, _)), _, _) => 1 
  case CC_D() => 2 
}
}