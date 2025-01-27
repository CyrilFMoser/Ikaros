package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Boolean, b: T_A[T_B, (T_B,T_B)], c: T_B) extends T_A[T_A[(T_B,T_B), T_A[T_B, T_B]], T_B]
case class CC_B[C]() extends T_A[T_A[(T_B,T_B), T_A[T_B, T_B]], T_B]

val v_a: T_A[T_A[(T_B,T_B), T_A[T_B, T_B]], T_B] = null
val v_b: Int = v_a match{
  case CC_A(true, _, _) => 0 
  case CC_A(false, _, _) => 1 
  case CC_B() => 2 
}
}