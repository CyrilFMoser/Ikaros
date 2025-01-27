package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_B[CC_A, C]) extends T_B[T_A, C]
case class CC_C[D](a: CC_B[D], b: D, c: D) extends T_B[T_A, D]
case class CC_D(a: CC_B[T_B[T_A, Boolean]], b: T_A) extends T_B[T_A, T_B[T_A, CC_C[(Int,Char)]]]

val v_a: T_B[T_A, Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}