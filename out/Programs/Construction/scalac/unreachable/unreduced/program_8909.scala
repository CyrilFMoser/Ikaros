package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[(Boolean,Int)]], b: Int) extends T_A[T_B[T_B[Boolean]]]
case class CC_B(a: T_A[CC_A], b: T_A[Int], c: CC_A) extends T_A[T_B[T_B[Boolean]]]
case class CC_C[C](a: C) extends T_B[C]

val v_a: T_A[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_C(_)), _) => 0 
  case CC_B(_, _, _) => 1 
}
}