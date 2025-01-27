package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Boolean) extends T_A[T_B[T_B[Boolean]], Int]
case class CC_B[E, D](a: D, b: T_B[E], c: T_A[D, T_B[T_A[D, CC_A]]]) extends T_A[D, E]
case class CC_C(a: T_B[CC_B[CC_A, Byte]], b: CC_B[(CC_A,Byte), T_B[CC_A]]) extends T_B[T_B[CC_A]]
case class CC_D(a: Boolean) extends T_B[T_B[CC_A]]

val v_a: T_A[T_B[T_B[Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}