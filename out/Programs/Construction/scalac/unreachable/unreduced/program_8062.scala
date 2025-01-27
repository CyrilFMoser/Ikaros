package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Char], b: T_A[Byte], c: (T_A[T_B],Boolean)) extends T_A[T_A[T_A[T_B]]]
case class CC_B() extends T_A[T_A[T_A[T_B]]]

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}