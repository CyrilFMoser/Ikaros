package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[Char], b: T_A[CC_A[Byte]], c: T_A[T_A[Char]]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}