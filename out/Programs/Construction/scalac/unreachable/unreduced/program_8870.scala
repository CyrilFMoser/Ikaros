package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_B[((Boolean,Char),Int)], c: T_A[T_A[Int]]) extends T_A[T_B[T_A[Boolean]]]
case class CC_B() extends T_A[T_B[T_A[Boolean]]]
case class CC_C(a: T_B[T_B[Int]], b: CC_B) extends T_B[Int]

val v_a: T_A[T_B[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}