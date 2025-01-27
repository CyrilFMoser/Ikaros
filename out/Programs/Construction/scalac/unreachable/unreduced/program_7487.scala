package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, Int], b: D, c: T_B[D]) extends T_A[D, Int]
case class CC_B[E](a: T_A[E, E], b: T_A[E, Int]) extends T_A[E, CC_A[T_A[Int, Byte]]]
case class CC_C(a: T_A[(Char,Int), T_B[Boolean]], b: Char, c: T_B[T_A[Int, Int]]) extends T_A[Boolean, CC_A[T_A[Int, Byte]]]
case class CC_D(a: (CC_C,CC_A[CC_C]), b: T_B[T_B[Int]], c: CC_B[CC_A[CC_C]]) extends T_B[Int]
case class CC_E() extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D((CC_C(_, _, _),CC_A(_, _, _)), _, CC_B(_, _)) => 0 
  case CC_E() => 1 
}
}