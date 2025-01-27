package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]], b: T_A[T_A[Boolean]], c: T_B[T_A[Int]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_B() extends T_A[T_B[T_B[Boolean]]]
case class CC_C[C](a: T_B[C], b: CC_A, c: T_A[T_B[C]]) extends T_B[C]
case class CC_D[D](a: CC_C[D], b: T_B[D]) extends T_B[(CC_C[CC_A],T_B[(Byte,Byte)])]

val v_a: T_A[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(_, CC_A(_, _, _), _)) => 0 
  case CC_B() => 1 
}
}