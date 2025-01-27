package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_B[Char, Boolean]]) extends T_A[T_B[T_B[(Boolean,Boolean), Int], T_A[Boolean]]]
case class CC_B(a: Boolean, b: T_B[(Int,Int), T_A[CC_A]], c: T_B[T_A[CC_A], T_B[CC_A, CC_A]]) extends T_A[T_B[T_B[(Boolean,Boolean), Int], T_A[Boolean]]]

val v_a: T_A[T_B[T_B[(Boolean,Boolean), Int], T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}