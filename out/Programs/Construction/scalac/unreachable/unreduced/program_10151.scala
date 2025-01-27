package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[(Byte,(Char,Boolean))], c: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B[B](a: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: (T_A[CC_A],CC_B[CC_A])) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C((_,CC_B(_))) => 2 
}
}