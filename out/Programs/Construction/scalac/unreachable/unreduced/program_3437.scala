package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: D, b: Int, c: T_B) extends T_A[C, (Boolean,Int)]
case class CC_B(a: T_B) extends T_A[T_A[T_B, T_A[Byte, T_B]], (Boolean,Int)]
case class CC_C[E](a: T_A[E, (Boolean,Int)], b: E) extends T_A[E, (Boolean,Int)]

val v_a: T_A[T_A[T_B, T_A[Byte, T_B]], (Boolean,Int)] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)