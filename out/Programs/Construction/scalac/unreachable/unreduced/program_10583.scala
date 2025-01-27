package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]], b: T_B[Char], c: (T_A[Int],Int)) extends T_A[T_A[T_A[Int]]]
case class CC_B[C](a: CC_A, b: (T_B[CC_A],CC_A), c: T_A[C]) extends T_B[C]
case class CC_C(a: (CC_B[CC_A],T_A[(Int,Int)])) extends T_B[T_B[T_B[(Int,Boolean)]]]
case class CC_D() extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_B(_, _, _),CC_A(_, _, _)), _) => 0 
  case CC_D() => 1 
}
}