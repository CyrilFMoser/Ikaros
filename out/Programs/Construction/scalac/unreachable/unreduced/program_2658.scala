package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[E, E], b: Char, c: T_B[D]) extends T_A[D, E]
case class CC_B(a: T_B[T_B[Int]]) extends T_B[T_B[Boolean]]
case class CC_C(a: T_A[Byte, CC_B], b: ((Int,CC_B),T_A[CC_B, CC_B]), c: T_A[T_A[CC_B, (Char,Char)], CC_A[(Boolean,Char), (Int,Boolean)]]) extends T_B[T_B[Boolean]]

val v_a: T_B[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}