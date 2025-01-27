package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean) extends T_A[T_A[Byte, (Boolean,Int)], C]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[T_A[Byte, (Boolean,Int)], D]

val v_a: T_A[T_A[Byte, (Boolean,Int)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}