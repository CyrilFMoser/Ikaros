package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_B, C]
case class CC_B() extends T_A[T_B, T_A[T_A[(Byte,Char), Int], CC_A[T_B]]]
case class CC_C[D](a: T_A[D, D]) extends T_A[T_B, D]

val v_a: T_A[T_B, T_A[T_A[(Byte,Char), Int], CC_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B()