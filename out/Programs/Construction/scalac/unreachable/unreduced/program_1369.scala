package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[T_A[Char]], c: (T_A[Byte],T_A[Byte])) extends T_A[T_A[T_A[Boolean]]]
case class CC_B[B](a: T_A[B], b: Int) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}