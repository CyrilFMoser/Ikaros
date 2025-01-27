package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]]) extends T_A[T_B[T_B[Int]]]
case class CC_B(a: T_B[CC_A], b: T_B[T_B[(Char,Int)]], c: T_B[T_A[CC_A]]) extends T_A[T_B[T_B[Int]]]
case class CC_C[C](a: C, b: Int) extends T_B[C]
case class CC_D[D](a: T_A[D], b: T_B[D], c: (T_B[Int],CC_A)) extends T_B[D]

val v_a: T_A[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_A(CC_D(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}