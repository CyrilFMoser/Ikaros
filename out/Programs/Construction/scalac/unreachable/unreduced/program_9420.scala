package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[(Int,Boolean)])) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A, b: T_A[Byte]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: (CC_B,CC_B)) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C((CC_B(_, _),CC_B(_, _)))