package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Byte) extends T_A[T_A[T_B, T_A[T_B, T_B]], T_B]
case class CC_B(a: CC_A, b: T_B, c: (T_B,T_A[CC_A, T_B])) extends T_A[T_A[T_B, T_A[T_B, T_B]], T_B]

val v_a: T_A[T_A[T_B, T_A[T_B, T_B]], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, (_,_)) => 1 
}
}